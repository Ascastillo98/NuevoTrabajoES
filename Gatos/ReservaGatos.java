import java.util.Scanner;

public class ReservaGatos{
        Gato[] GatosEnReserva = new Gato[50];
        int numGatos = 0;

        public void añadirGato(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese los datos del Gato:");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea pendiente después de nextInt()

            System.out.print("Especie: ");
            String especie = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea pendiente después de nextInt()

            System.out.print("Color: ");
            String color = scanner.nextLine();

            System.out.print("Peso: ");
            int peso = scanner.nextInt();

            // Crear un objeto Gato con los datos ingresados
            Gato nuevoGato = new Gato(id, especie, edad, color, peso);

            GatosEnReserva[numGatos] = nuevoGato;
            numGatos++;
        }

        public void liberarGato(){

            System.out.print("ID del Gato: ");
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