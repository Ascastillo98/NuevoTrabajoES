package gatos;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReservaGatos{
        Logger logger = Logger.getLogger(getClass().getName());
        Oso[] gatosReserva = new Gato[50];
        int numGatos = 0;

        public void nuevoGato(){
            Scanner scanner = new Scanner(System.in);

            logger.info("Ingrese los datos del Gato:");
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

            // Crear un objeto Gato con los datos ingresados
            Gato nuevoGato = new Gato(id, especie, edad, color, peso);

            GatosEnReserva[numGatos] = nuevoGato;
            numGatos++;
        }

        public void liberarGato(){

            logger.info("ID del Gato: ");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();

            for(int i = 0; i < numGatos; i++){
                if(GatosEnReserva[i].id == id){
                  GatosEnReserva[i] = null;
                  numGatos--; 
                }
            }
        }

        public void verGatos(){
            for(int i = 0; i < numGatos; i++){
                GatosEnReserva[i].verGato();
            }
        }
}