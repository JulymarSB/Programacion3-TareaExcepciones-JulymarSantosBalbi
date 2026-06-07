public class CorreoInvalidoExcepcion extends Exception{
    
    String mensaje;

    public CorreoInvalidoExcepcion(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage()
    {
        return mensaje;
    }
}
