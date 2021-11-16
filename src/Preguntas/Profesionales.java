package Preguntas;

public class Profesionales extends modelo_preguntas
{
    public Profesionales()
    {
        this.Categoria = "Profesional";
        this.Premio = 600000;
        
        this.Preguntas[0] = "¿Cual es la edad de la tierra en años?";
        this.Preguntas[1] = "¿A que edad murio Einstein?";
        this.Preguntas[2] = "¿Cual es el planeta mas similar a la tierra?";
        this.Preguntas[3] = "¿Cual es la estrella más grande?";
        this.Preguntas[4] = "¿Quien creo el primer automovil?";
        this.Preguntas[5] = "¿Cual es la ciudad más pequeña del mundo?";
        
        this.Respuestas[0][0] = "2021";
        this.Respuestas[0][1] = "4042";
        this.Respuestas[0][2] = "4543";
        this.Respuestas[0][3] = "8254";
        
        this.Respuestas[1][0] = "75";
        this.Respuestas[1][1] = "88";
        this.Respuestas[1][2] = "84";
        this.Respuestas[1][3] = "76";
        
        this.Respuestas[2][0] = "Kepler-186f";
        this.Respuestas[2][1] = "Marte";//
        this.Respuestas[2][2] = "Kepler-190f";
        this.Respuestas[2][3] = "Sirius";
        
        this.Respuestas[3][0] = "Sirius";
        this.Respuestas[3][1] = "Exhodus";
        this.Respuestas[3][2] = "Lopus-8";
        this.Respuestas[3][3] = "Uy Scuti";//
    
        this.Respuestas[4][0] = "Andre Citroen";
        this.Respuestas[4][1] = "Carl Benz";//
        this.Respuestas[4][2] = "Alexander Winton";
        this.Respuestas[4][3] = "George B. Selden";
        
        this.Respuestas[5][0] = "Hum";//
        this.Respuestas[5][1] = "Camden";
        this.Respuestas[5][2] = "Bled";
        this.Respuestas[5][3] = "Bibury";
        
        this.RespuestasCorrectas[0] = "c";
        this.RespuestasCorrectas[1] = "d";
        this.RespuestasCorrectas[2] = "a";
        this.RespuestasCorrectas[3] = "d";
        this.RespuestasCorrectas[4] = "b";
        this.RespuestasCorrectas[5] = "a";
    }
}
