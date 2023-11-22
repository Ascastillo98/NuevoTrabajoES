import java.util.Scanner;

public class menuInicioCaballo {
    
    public static void main(String[] args) {
        reservaCaballos r = new reserva();
        Scanner s = new Scanner(System.in);

        System.out.println("1. Añadir Caballo");
        System.out.println("2. Liberar Caballo");
        System.out.println("3. Ver Caballos");
        System.out.println("Seleccione una opción:");

        int opcion = s.nextInt();

        switch (opcion) {
            case 1:
                r.añadirCaballo();
                break;
            case 2:
                r.liberarCaballo();
                break;
            case 3:
                r.verCaballos();
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        s.close();
    }

}