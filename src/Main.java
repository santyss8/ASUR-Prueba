import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Socio> socios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {

            System.out.println("Bienvenido!");
            System.out.println("Que quieres hacer?");
            System.out.println("1- Registrar Socio");
            System.out.println("2- Modificar Socio");
            System.out.println("3- Crear Actividad");
            System.out.println("4- Modificar Actividad");
            System.out.println("5- Reservar Salones");
            System.out.println("6- Mostrar lista de usuarios");
            System.out.println("7- Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    registrarSocio(socios);
                    break;
                case 2:
                    // Aquí se agregarían las funciones para modificar un socio
                    break;
                case 3:
                    // Aquí se agregarían las funciones para crear una actividad
                    break;
                case 4:
                    // Aquí se agregarían las funciones para modificar una actividad
                    break;
                case 5:
                    // Aquí se agregarían las funciones para reservar salones
                    break;
                case 6:
                    mostrarSocios(socios);
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();


    }

    public static void mostrarSocios(ArrayList<Socio> socios) {
        System.out.println("Lista de usuarios");
        for (Socio e : socios) {
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Categoria de socio: " + e.getCategoria());
            System.out.println("Dificultad auditiva: " + e.getDificultadAuditiva());
            System.out.println("Uso de lenguaje de senas: " + e.getLenguajeSenas());
            System.out.println("Participa de subcomisiones: " + e.getParticipacionSubcomisiones());
        }
        System.out.println("Presione Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();  // Espera a que el usuario presione Enter
    }

    public static void registrarSocio(ArrayList<Socio> socios){
        System.out.println("Registrar socio");
        System.out.println("Ingrese el nombre del socio");
        Scanner input = new Scanner(System.in);
        String nombre = input.nextLine();
        System.out.println("Ingrese el documento del socio");
        int documento = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el domicilio del socio");
        String domicilio = input.nextLine();
        System.out.println("Ingrese el celular del socio");
        int celular = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el correo del socio");
        String correo = input.nextLine();
        System.out.println("Ingrese la categoria del socio");
        String categoria = input.nextLine();
        System.out.println("Ingrese la dificultad auditiva del socio");
        String dificultadAuditiva = input.nextLine();
        System.out.println("Ingrese el uso de lenguaje de senas del socio");
        String lenguaje = input.nextLine();
        System.out.println("El socio participa en las subcomisiones?");
        String subcomisiones = input.nextLine();

        Socio nuevoSocio = new Socio(nombre, documento, domicilio, celular, correo, categoria, dificultadAuditiva, lenguaje, subcomisiones);
        socios.add(nuevoSocio);
    }

}