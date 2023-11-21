import java.util.Scanner;

public class reservaCaballos{
        caballo[] CaballosEnReserva = new caballo[50];
        int numCaballos = 0;

        public void añadircaballo(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese los datos del caballo:");
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