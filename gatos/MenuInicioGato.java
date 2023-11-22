package gatos;

import java.util.Scanner;
import java.util.logging.Logger;

public class MenuInicioGato {
    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {
        ReservaGatos r = new reserva();
        Scanner s = new Scanner(System.in);

        logger.info("1. Añadir Gato");
        logger.info("2. Liberar Gato");
        logger.info("3. Ver Gatos");
        logger.info("Seleccione una opción:");

        int opcion = s.nextInt();

        switch (opcion) {
            case 1:
                r.nuevoGato();
                break;
            case 2:
                r.liberarGato();
                break;
            case 3:
                r.verGato();
                break;
            default:
                logger.info("Opción no válida");
        }
        
        s.close();
    }

}