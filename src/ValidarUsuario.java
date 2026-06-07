public class ValidarUsuario  {

    public static void validarUsuario(String nombre, int edad, String correo, double salario) 
    throws NombreInvalidoExcepcion, EdadInvalidaExcepcion, CorreoInvalidoExcepcion, SalarioInvalidoExcepcion 
    {
        if(nombre == null || nombre.trim().isEmpty()){
            throw new NombreInvalidoExcepcion("El nombre no puede estar vacio");

        }
        if(nombre.length() < 3){
            throw new NombreInvalidoExcepcion("El nombre debe contener al menos 3 caracteres");
        }
        if(edad < 18){
            throw new EdadInvalidaExcepcion("La edad deber ser mayor o igual a 18.");
        }
        if(edad > 100){
            throw new EdadInvalidaExcepcion("La edad debe ser menor o igual a 100");
        }
        if(!correo.contains("@") || !correo.contains(".")){
            throw new CorreoInvalidoExcepcion("El correo electronico no es valido.");
        }
        if(salario <= 0){
            throw new SalarioInvalidoExcepcion("El salario debe ser mayor que cero.");
        }
    }
}
