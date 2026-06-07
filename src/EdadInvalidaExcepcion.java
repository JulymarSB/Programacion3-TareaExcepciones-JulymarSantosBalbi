public class EdadInvalidaExcepcion extends Exception {
    
    String mensaje;

    public EdadInvalidaExcepcion(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage(){
        return mensaje;
    }
}
