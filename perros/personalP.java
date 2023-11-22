public class personalP{
    private int id;
    private String nombre;
    private int edad;
    private String puesto;
    private boolean indefinido;

    public personalP(int i, String n, int e, String p, boolean ind){
        id = i;
        nombre = n;
        edad = e;
        puesto = p;
        indefinido = ind;
    }

    public verdatos(){
        logger.info("id: ", id);
        logger.info("nombre: ", n);
        logger.info("edad: ", edad);
        logger.info("puesto: ", puesto);
        logger.info("indefinido: ", indefinido);

    }
}