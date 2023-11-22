package osos;

import java.util.Scanner;
import java.util.logging.Logger;

public class MenuInicioOso {
    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {
        ReservaOsos r = new reserva();
        Scanner s = new Scanner(System.in);

        logger.info("1. Añadir Oso");
        logger.info("2. Liberar Oso");
        logger.info("3. Ver Osos");
        logger.info("Seleccione una opción:");

        int opcion = s.nextInt();

        switch (opcion) {
            case 1:
                r.nuevoOso();
                break;
            case 2:
                r.liberarOso();
                break;
            case 3:
                r.verOso();
                break;
            default:
                logger.info("Opción no válida");
        }
        
        s.close();
    }

}