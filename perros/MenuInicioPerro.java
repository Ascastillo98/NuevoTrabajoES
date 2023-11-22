package perros;

import java.util.Scanner;
import java.util.logging.Logger;

public class MenuInicioPerro {
    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {
        ReservaPerros r = new reserva();
        Scanner s = new Scanner(System.in);

        logger.info("1. Añadir Perro");
        logger.info("2. Liberar Perro");
        logger.info("3. Ver Perros");
        logger.info("Seleccione una opción:");

        int opcion = s.nextInt();

        switch (opcion) {
            case 1:
                r.nuevoPerro();
                break;
            case 2:
                r.liberarPerro();
                break;
            case 3:
                r.verPerro();
                break;
            default:
                logger.info("Opción no válida");
        }
        
        s.close();
    }

}