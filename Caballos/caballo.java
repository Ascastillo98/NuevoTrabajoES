public class caballo{
    Logger logger = Logger.getLogger(getClass().getName());
        public int id;
        public String especie;
        public int edad;
        public String color;
        public int peso;
        
        public caballo(int i, String s, int e, String c, int p) {
            id = i;
            especie = s;
            edad = e;
            color = c;
            peso = p;
        }
        public void vercaballo(){
            logger.info("Especie: ", especie);
            logger.info("edad: ", edad);
            logger.info("color: ", color);
            logger.info("peso: ", peso);
        }
}
