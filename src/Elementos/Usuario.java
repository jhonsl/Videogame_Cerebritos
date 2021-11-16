package Elementos;

public class Usuario 
{
    private String nombre = "";
    private int premio = 0;
    
    public Usuario(){}
    
    public Usuario(String Nombre, int Premio)
    {
        this.nombre = Nombre;
        this.premio = Premio;
    }
    
    public void EstablecerNombre(String nom)
    {
        this.nombre = nom;
    }
    
    public void EstablecerPremio(int pre)
    {
        this.premio = pre;
    }
    
    public String RetornarNombre()
    {
        return this.nombre;
    }
    
    public int RetornarPremio()
    {
        return this.premio;
    }
}
