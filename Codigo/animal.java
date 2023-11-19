public class animal{
        public int id;
        public String especie;
        public int edad;
        public String color;
        public int peso;
        public animal(int i, String s, int e, String c, int p) {
            id = i;
            especie = s;
            edad = e;
            color = c;
            peso = p;
        }
        public void verAnimal(){
            System.out.println("Especie: " + especie);
            System.out.println("edad: " + edad);
            System.out.println("color: " + color);
            System.out.println("peso: " + peso);
        }
}
