import java.util.Scanner;

public class MenuInicioPerro {

    public static void main(String[] args) {
        ReservaPerros r = new reserva();
        Scanner s = new Scanner(System.in);

        System.out.println("1. Añadir Perro");
        System.out.println("2. Liberar Perro");
        System.out.println("3. Ver Perros");
        System.out.println("Seleccione una opción:");

        int opcion = s.nextInt();

        switch (opcion) {
            case 1:
                r.añadirPerro();
                break;
            case 2:
                r.liberarPerro();
                break;
            case 3:
                r.verPerro();
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        s.close();
    }

}