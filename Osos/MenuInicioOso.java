import java.util.Scanner;

public class MenuInicioOso {

    public static void main(String[] args) {
        ReservaOsos r = new reserva();
        Scanner s = new Scanner(System.in);

        System.out.println("1. Añadir Oso");
        System.out.println("2. Liberar Oso");
        System.out.println("3. Ver Osos");
        System.out.println("Seleccione una opción:");

        int opcion = s.nextInt();

        switch (opcion) {
            case 1:
                r.añadirOso();
                break;
            case 2:
                r.liberarOso();
                break;
            case 3:
                r.verOso();
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        s.close();
    }

}