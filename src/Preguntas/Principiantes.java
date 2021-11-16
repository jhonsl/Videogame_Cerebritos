package Preguntas;

public class Principiantes extends modelo_preguntas
{ 
    public Principiantes()
    {
        this.Categoria = "Principiante";
        this.Premio = 25000;
        
        this.Preguntas[0] = "¿Cual es la capital de Buenos Aires?";
        this.Preguntas[1] = "¿Cuantos continentes existen?";
        this.Preguntas[2] = "¿Quien interpreta al chapulin colorado?";
        this.Preguntas[3] = "¿Cuantos dias tiene un año bisiesto?";
        this.Preguntas[4] = "¿Quien escribio don quijote de la mancha?";
        this.Preguntas[5] = "¿Cuantos dias tiene febrero?";
        
        this.Respuestas[0][0] = "Bogota";
        this.Respuestas[0][1] = "Rio de janeiro";
        this.Respuestas[0][2] = "Caracas";
        this.Respuestas[0][3] = "Buenos aires";
        
        this.Respuestas[1][0] = "6";
        this.Respuestas[1][1] = "1";
        this.Respuestas[1][2] = "7";
        this.Respuestas[1][3] = "8";
        
        this.Respuestas[2][0] = "El chavo del 8";
        this.Respuestas[2][1] = "Tom Holland";
        this.Respuestas[2][2] = "Chespírito";
        this.Respuestas[2][3] = "Roberto Gomez Bolaños";
        
        this.Respuestas[3][0] = "366";
        this.Respuestas[3][1] = "365";
        this.Respuestas[3][2] = "367";
        this.Respuestas[3][3] = "364";
    
        this.Respuestas[4][0] = "Simon Bolivar";
        this.Respuestas[4][1] = "Sancho Panza";
        this.Respuestas[4][2] = "Miguel de Cervantez";
        this.Respuestas[4][3] = "Gabriel Garcia Marquez";
        
        this.Respuestas[5][0] = "28";
        this.Respuestas[5][1] = "29";
        this.Respuestas[5][2] = "30";
        this.Respuestas[5][3] = "31";
        
        this.RespuestasCorrectas[0] = "d";
        this.RespuestasCorrectas[1] = "c";
        this.RespuestasCorrectas[2] = "d";
        this.RespuestasCorrectas[3] = "a";
        this.RespuestasCorrectas[4] = "c";
        this.RespuestasCorrectas[5] = "a";
    }
    
    
}
