public class NombreInvalidoExcepcion extends Exception{
    
    String mensaje;

    public NombreInvalidoExcepcion(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage(){
        return mensaje;
    }
}
