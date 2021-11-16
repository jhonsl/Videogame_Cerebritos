package Preguntas;

public class Veteranas extends modelo_preguntas
{
    public Veteranas()
    {
        this.Categoria = "Veterano";
        this.Premio = 200000;
        
        this.Preguntas[0] = "¿Cuantos planetas tiene el sistema solar?";
        this.Preguntas[1] = "¿Donde se encontro la primera biblia?";
        this.Preguntas[2] = "¿Quien pinto la mona lisa?";
        this.Preguntas[3] = "¿Quien descubrio mexico?";
        this.Preguntas[4] = "¿Donde se encuentra la tumba de Carlomagno?";
        this.Preguntas[5] = "¿Donde se invento el papel?";
        
        this.Respuestas[0][0] = "12";
        this.Respuestas[0][1] = "10";
        this.Respuestas[0][2] = "11";
        this.Respuestas[0][3] = "8";
        
        this.Respuestas[1][0] = "Jerusalen";
        this.Respuestas[1][1] = "Israel";
        this.Respuestas[1][2] = "Egipto";
        this.Respuestas[1][3] = "Pakistan";
        
        this.Respuestas[2][0] = "Leonardo Da Vinci";
        this.Respuestas[2][1] = "Miguel Angel";
        this.Respuestas[2][2] = "Botero";
        this.Respuestas[2][3] = "Vincent Van Gogh";
        
        this.Respuestas[3][0] = "Cristobal Colon";
        this.Respuestas[3][1] = "Hernan Cortes";
        this.Respuestas[3][2] = "Napoleon Bonaparte";
        this.Respuestas[3][3] = "Antonio Nariño";
    
        this.Respuestas[4][0] = "Egipto";
        this.Respuestas[4][1] = "Roma";
        this.Respuestas[4][2] = "Grecia";
        this.Respuestas[4][3] = "Alemania";
        
        this.Respuestas[5][0] = "E.E.U.U";
        this.Respuestas[5][1] = "Roma";
        this.Respuestas[5][2] = "China";
        this.Respuestas[5][3] = "Mesopotamia";
        
        this.RespuestasCorrectas[0] = "d";
        this.RespuestasCorrectas[1] = "b";
        this.RespuestasCorrectas[2] = "a";
        this.RespuestasCorrectas[3] = "b";
        this.RespuestasCorrectas[4] = "d";
        this.RespuestasCorrectas[5] = "c";
    }
}
