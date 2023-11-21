import java.util.Scanner;

public class ReservaPerros{
        Perro[] PerrosEnReserva = new Perro[50];
        int numPerros = 0;

        public void añadirPerro(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese los datos del Perro:");
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

            // Crear un objeto Perro con los datos ingresados
            Perro nuevoPerro = new Perro(id, especie, edad, color, peso);

            PerrosEnReserva[numPerros] = nuevoPerro;
            numPerros++;
        }

        public void liberarPerro(){

            System.out.print("ID del Perro: ");
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