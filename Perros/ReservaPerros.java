package perro;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReservaPerros{
        Logger logger = Logger.getLogger(getClass().getName());
        Perro[] PerrosEnReserva = new Perro[50];
        int numPerros = 0;

        public void añadirPerro(){
            Scanner scanner = new Scanner(System.in);

            logger.info("Ingrese los datos del Perro:");
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

            // Crear un objeto Perro con los datos ingresados
            Perro nuevoPerro = new Perro(id, especie, edad, color, peso);

            PerrosEnReserva[numPerros] = nuevoPerro;
            numPerros++;
        }

        public void liberarPerro(){

            logger.info("ID del Perro: ");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();

            for(int i = 0; i < numPerros; i++){
                if(PerrosEnReserva[i].id == id){
                  PerrosEnReserva[i] = null;
                  numPerros--; 
                }
            }
        }

        public void verPerros(){
            for(int i = 0; i < numPerros; i++){
                PerrosEnReserva[i].verPerro();
            }
        }
}