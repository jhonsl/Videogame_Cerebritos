package Preguntas;

public class modelo_preguntas
{
    protected String Categoria;
    protected String[] Preguntas = new String[6];
    protected String[][] Respuestas = new String[6][4];
    protected String[] RespuestasCorrectas = new String[6];
    protected int Premio;
    
    public modelo_preguntas(){}
    
    public String retornarCategoria()
    {
        return Categoria;
    }
    
    public String retornarPregunta(int pregunta)
    {
        return Preguntas[pregunta];
    }
    
    public String retornarRespuestas(int pregunta, int respuesta)
    {
        return Respuestas[pregunta][respuesta];
    }
    
    public boolean Acerto_perdio(int pregunta, String respuesta)
    {
        if(respuesta.equals(RespuestasCorrectas[pregunta]))
            return true;
        else
            return false;
    }
    
    public int retornarPremio()
    {
        return Premio;
    }
}
