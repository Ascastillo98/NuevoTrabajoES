import java.util.Scanner;

public class menuInicio {

    public static void main(String[] args) {
        reserva r = new reserva();
        Scanner s = new Scanner(System.in);

        System.out.println("1. Añadir Animal");
        System.out.println("2. Liberar Animal");
        System.out.println("3. Ver Animales");
        System.out.println("Seleccione una opción:");

        int opcion = s.nextInt();

        switch (opcion) {
            case 1:
                r.añadirAnimal();
                break;
            case 2:
                r.liberarAnimal();
                break;
            case 3:
                r.verAnimales();
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        s.close();
    }

}