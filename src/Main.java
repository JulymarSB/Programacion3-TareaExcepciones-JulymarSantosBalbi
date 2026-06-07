import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);


        int opcion;

        do{

            System.out.println("Seleccione una opcion: ");

            System.out.println("==== Registro de usuarios ====");
            System.out.println("------------------------------");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Salir");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch(opcion){

                case 1:
                    try{
                        System.out.print("Nombre: ");
                        String nombre = entrada.nextLine();

                        System.out.print("Edad: ");
                        int edad = entrada.nextInt();
                        entrada.nextLine();

                        System.out.print("Correo: ");
                        String correo = entrada.nextLine();

                        System.out.print("Salario: ");
                        double salario = entrada.nextDouble();
                        entrada.nextLine();

                        ValidarUsuario.validarUsuario(nombre, edad, correo, salario);

                        System.out.println("Usuario registrado correctamente");
                    }
                    catch(NombreInvalidoExcepcion e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    catch(EdadInvalidaExcepcion e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    catch(CorreoInvalidoExcepcion e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    catch(SalarioInvalidoExcepcion e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    catch(InputMismatchException e){
                        System.out.println("Error: Debe ingresar un numero valido");

                        entrada.nextLine();
                    }
                    finally{
                        System.out.println("Proceso finalizado");
                    }
                    break;

                case 2:
                    System.out.println("Saliendo");

                default:
                    System.out.println("Opcion invalida");

            }


        }while (opcion != 2);


       

    }
}
