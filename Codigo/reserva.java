import java.util.Scanner;

public class reserva{
        animal[] AnimalesEnReserva = new animal[50];
        int numAnimales = 0;

        public void añadirAnimal(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese los datos del animal:");
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

            // Crear un objeto animal con los datos ingresados
            animal nuevoAnimal = new animal(id, especie, edad, color, peso);

            AnimalesEnReserva[numAnimales] = nuevoAnimal;
            numAnimales++;
        }

        public void liberarAnimal(){

            System.out.print("ID del animal: ");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();

            for(int i = 0; i < numAnimales; i++){
                if(AnimalesEnReserva[i].id == id){
                  AnimalesEnReserva[i] = null;
                  numAnimales--; 
                }
            }
        }

        public void verAnimales(){
            for(int i = 0; i < numAnimales; i++){
                AnimalesEnReserva[i].verAnimal();
            }
        }
}