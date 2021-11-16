package Interfaz;

import Elementos.Reproductor;

public class main 
{ 
    public static void main(String[] args)
    {
        try {
            Reproductor reproductor = new Reproductor();
            reproductor.AbrirFichero("C:\\Users\\jhon salazar\\Documents\\proyectos\\softka\\src\\recursos/cancion.mp3");
            reproductor.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        Partida partida = new Partida(); 
    }
}
