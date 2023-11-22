import java.util.Scanner;

public class ReservaOsos{
        Oso[] ososReserva = new Oso[50];
        int numOsos = 0;

        public void nuevoOso(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese los datos del Oso:");
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

            // Crear un objeto Oso con los datos ingresados
            Oso nuevoOso = new Oso(id, especie, edad, color, peso);

            OsosEnReserva[numOsos] = nuevoOso;
            numOsos++;
        }

        public void liberarOso(){

            System.out.print("ID del Oso: ");
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