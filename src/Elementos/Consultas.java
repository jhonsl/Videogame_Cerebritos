package Elementos;

import java.sql.*;

public class Consultas 
{
    //creamos una variable para la conexion
    private Connection con;
    
    //creamos el metodo para hacer create nuevos usuarios
    public void AgregarUsuario(Usuario usuario)
    {
        //encerramos todo en un try para manejar los errores
        try{
            //si no hay ninguna conexion entonces generamos una
            if(con == null)
                con = Conexion_Sql.getConexion();
            
            String sql = "INSERT INTO puntajes(nombre,puntaje) values(?,?)";
            
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, usuario.RetornarNombre());
            statement.setInt(2, usuario.RetornarPremio());
            int RowsInserted = statement.executeUpdate();
            
            if(RowsInserted > 0)
            {
                System.out.println("La insercion fue exitosa");
                System.out.println("--------------------------------------");
            }
            else
            {
                System.out.println("Hubo un error con la insercion");
                System.out.println("--------------------------------------");
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    
    //Creamos el metodo para hacer retrieve de la informacion de un determinado producto
    public Usuario ObtenerUsuario(String nombre)
    {
        /*creamos una instancia de la clase usuario que sera donde almacenaremos la informacion
        del usuario que deseemos analizar*/
        Usuario jugador = new Usuario();    
        //encerramos todo en un try para manejar los errores
        try
        {
            //si no hay ninguna conexion entonces generamos una
            if(con == null)
                con = Conexion_Sql.getConexion();
            
            String sql = "SELECT * FROM puntajes WHERE nombre = ?";    
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, nombre);
            ResultSet result = statement.executeQuery();
            
            result.next();
            //agregamos toda la informacion obtenida a la instancia del objeto
            jugador = new Usuario(result.getString(1),result.getInt(2));          
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        
        //retornamos dicho producto o instancia
        return jugador;
    }  
}
