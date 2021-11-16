package Preguntas;

public class Avanzadas extends modelo_preguntas
{
    public Avanzadas()
    {
        this.Categoria = "Avanzado";
        this.Premio = 125000;
        
        this.Preguntas[0] = "¿Cual es el planeta más pequeño del sistema solar?";
        this.Preguntas[1] = "¿Cual es el continente más grande?";
        this.Preguntas[2] = "¿Quien creo el wifi?";
        this.Preguntas[3] = "¿Cuantos estados tiene USA?";
        this.Preguntas[4] = "¿Donde se celebra el dia de los muertos?";
        this.Preguntas[5] = "¿Donde esta ubicado el Taj Mahal?";
        
        this.Respuestas[0][0] = "Mercurio";
        this.Respuestas[0][1] = "Tierra";
        this.Respuestas[0][2] = "Marte";
        this.Respuestas[0][3] = "Jupiter";
        
        this.Respuestas[1][0] = "America";
        this.Respuestas[1][1] = "Europa";
        this.Respuestas[1][2] = "Asia";
        this.Respuestas[1][3] = "Africa";
        
        this.Respuestas[2][0] = "Thomas Alva Edinson";
        this.Respuestas[2][1] = "Hedy Lamarr";
        this.Respuestas[2][2] = "Elon Musk";
        this.Respuestas[2][3] = "Tony Stark";
        
        this.Respuestas[3][0] = "48";
        this.Respuestas[3][1] = "45";
        this.Respuestas[3][2] = "49";
        this.Respuestas[3][3] = "50";
    
        this.Respuestas[4][0] = "China";
        this.Respuestas[4][1] = "Mexico";
        this.Respuestas[4][2] = "Bolivia";
        this.Respuestas[4][3] = "Colombia";
        
        this.Respuestas[5][0] = "India";
        this.Respuestas[5][1] = "Vietnam";
        this.Respuestas[5][2] = "China";
        this.Respuestas[5][3] = "Japon";
        
        this.RespuestasCorrectas[0] = "a";
        this.RespuestasCorrectas[1] = "c";
        this.RespuestasCorrectas[2] = "b";
        this.RespuestasCorrectas[3] = "d";
        this.RespuestasCorrectas[4] = "b";
        this.RespuestasCorrectas[5] = "a";
    }
}
