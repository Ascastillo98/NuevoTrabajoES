package osos;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReservaOsos{
        Logger logger = Logger.getLogger(getClass().getName());
        Oso[] ososReserva = new Oso[50];
        int numOsos = 0;

        public void nuevoOso(){
            Scanner scanner = new Scanner(System.in);

            logger.info("Ingrese los datos del Oso:");
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

            // Crear un objeto Oso con los datos ingresados
            Oso nuevoOso = new Oso(id, especie, edad, color, peso);

            OsosEnReserva[numOsos] = nuevoOso;
            numOsos++;
        }

        public void liberarOso(){

            logger.info("ID del Oso: ");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();

            for(int i = 0; i < numOsos; i++){
                if(OsosEnReserva[i].id == id){
                  OsosEnReserva[i] = null;
                  numOsos--; 
                }
            }
        }

        public void verOsos(){
            for(int i = 0; i < numOsos; i++){
                OsosEnReserva[i].verOso();
            }
        }
}