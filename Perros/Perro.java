public class Perro{
        private int id;
        private String especie;
        private int edad;
        private String color;
        private int peso;
        public Perro(int i, String s, int e, String c, int p) {
            id = i;
            especie = s;
            edad = e;
            color = c;
            peso = p;
        }
        public void verPerro(){
            System.out.println("Especie: " + especie);
            System.out.println("edad: " + edad);
            System.out.println("color: " + color);
            System.out.println("peso: " + peso);
        }
}
