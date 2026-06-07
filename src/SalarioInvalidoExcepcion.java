public class SalarioInvalidoExcepcion extends Exception{
    
    String mensaje;

    public SalarioInvalidoExcepcion(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage(){
        return mensaje;
    }
}
