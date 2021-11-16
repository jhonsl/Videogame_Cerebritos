package Elementos;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;

public class Reproductor 
{
    private BasicPlayer player;

    public Reproductor()
    {
        player=new BasicPlayer(); 
    }

    public void Play() throws Exception 
    {
        player.play();
    }

    public void AbrirFichero(String ruta) throws Exception {
        player.open(new File(ruta));
    }

    public void Pausa() throws Exception {
        player.pause();
    }

    public void Continuar() throws Exception {
        player.resume();
    }

    public void Stop() throws Exception {
        player.stop();
    }
}
