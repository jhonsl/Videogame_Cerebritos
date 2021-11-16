package Preguntas;

public class Intermedias extends modelo_preguntas
{
    public Intermedias()
    {
        this.Categoria = "Intermedio";
        this.Premio = 50000;
        
        this.Preguntas[0] = "¿Quien invento el primer smartphone?";
        this.Preguntas[1] = "¿Quien descubrio America?";
        this.Preguntas[2] = "¿Quien invento la electricidad?";
        this.Preguntas[3] = "¿Cual es el pais más poblado del mundo?";
        this.Preguntas[4] = "¿Que dia es la independencia de colombia?";
        this.Preguntas[5] = "¿Cuantos dias tiene febrero?";
        
        this.Respuestas[0][0] = "Samsung";
        this.Respuestas[0][1] = "Apple";
        this.Respuestas[0][2] = "Nokia";
        this.Respuestas[0][3] = "Motorola";
        
        this.Respuestas[1][0] = "Cristobal Colon";
        this.Respuestas[1][1] = "Francisco Fernandez de Contreras";
        this.Respuestas[1][2] = "Napoleon Bonaparte";
        this.Respuestas[1][3] = "Simon Bolivar";
        
        this.Respuestas[2][0] = "Isaac Newton";
        this.Respuestas[2][1] = "Rene Descartes";
        this.Respuestas[2][2] = "Albert Einstein";
        this.Respuestas[2][3] = "Thomas Alva Edison";
        
        this.Respuestas[3][0] = "E.E.U.U";
        this.Respuestas[3][1] = "España";
        this.Respuestas[3][2] = "India";
        this.Respuestas[3][3] = "China";
    
        this.Respuestas[4][0] = "Simon Bolivar";
        this.Respuestas[4][1] = "Sancho Panza";
        this.Respuestas[4][2] = "Miguel de Cervantez";
        this.Respuestas[4][3] = "Gabriel Garcia Marquez";
        
        this.Respuestas[5][0] = "20 de julio";
        this.Respuestas[5][1] = "20 de Junio";
        this.Respuestas[5][2] = "21 de julio";
        this.Respuestas[5][3] = "21 de junio";
        
        this.RespuestasCorrectas[0] = "b";
        this.RespuestasCorrectas[1] = "a";
        this.RespuestasCorrectas[2] = "d";
        this.RespuestasCorrectas[3] = "d";
        this.RespuestasCorrectas[4] = "c";
        this.RespuestasCorrectas[5] = "a";
    }
}
