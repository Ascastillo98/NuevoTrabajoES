public class Gato{
    Logger logger = Logger.getLogger(getClass().getName());
        private int id;
        private String especie;
        private int edad;
        private String color;
        private int peso;
        public Gato(int i, String s, int e, String c, int p) {
            id = i;
            especie = s;
            edad = e;
            color = c;
            peso = p;
        }
        public void verAnimal(){
            logger.info("Especie: ", especie);
            logger.info("edad: ", edad);
            logger.info("color: ", color);
            logger.info("peso: ", peso);
        }
}
