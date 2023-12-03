import java.util.Scanner;
import java.util.logging.Logger;

public class menuInicioCaballo {
    Logger logger = Logger.getLogger(getClass().getName());
    public static void main(String[] args) {
        reservaCaballos r = new reserva();
        Scanner s = new Scanner(System.in);

        logger.info("1. Añadir Caballo");
        logger.info("2. Liberar Caballo");
        logger.info("3. Ver Caballos");
        logger.info("Seleccione una opción:");


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
                logger.info("Opción no válida");
        }
        
        s.close();
    }

}