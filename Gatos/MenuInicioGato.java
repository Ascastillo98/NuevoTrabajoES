import java.util.Scanner;

public class MenuInicioGatos {

    public static void main(String[] args) {
        ReservaGatos r = new reserva();
        Scanner s = new Scanner(System.in);

        System.out.println("1. Añadir Gato");
        System.out.println("2. Liberar Gato");
        System.out.println("3. Ver Gatos");
        System.out.println("Seleccione una opción:");

        int opcion = s.nextInt();

        switch (opcion) {
            case 1:
                r.añadirGato();
                break;
            case 2:
                r.liberarGato();
                break;
            case 3:
                r.verGato();
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        s.close();
    }

}