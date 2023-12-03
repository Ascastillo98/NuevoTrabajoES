import java.util.Scanner;

public class reservaCaballos{
        Logger logger = Logger.getLogger(getClass().getName());
        caballo[] CaballosEnReserva = new caballo[50];
        int numCaballos = 0;

        public void añadircaballo(){
            Scanner scanner = new Scanner(System.in);

            logger.info("Ingrese los datos del caballo:");
            logger.info("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea pendiente después de nextInt()

            logger.info("Especie: ");
            String especie = scanner.nextLine();

            logger.info("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea pendiente después de nextInt()

            logger.info("Color: ");
            String color = scanner.nextLine();

            logger.info("Peso: ");
            int peso = scanner.nextInt();

            // Crear un objeto caballo con los datos ingresados
            caballo nuevocaballo = new caballo(id, especie, edad, color, peso);

            CaballosEnReserva[numCaballos] = nuevocaballo;
            numCaballos++;
        }

        public void liberarcaballo(){

            System.out.print("ID del caballo: ");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();

            for(int i = 0; i < numCaballos; i++){
                if(CaballosEnReserva[i].id == id){
                  CaballosEnReserva[i] = null;
                  numCaballos--; 
                }
            }
        }

        public void verCaballos(){
            for(int i = 0; i < numCaballos; i++){
                CaballosEnReserva[i].vercaballo();
            }
        }
}