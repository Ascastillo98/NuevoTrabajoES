package gatos;
public class PersonalG{
    private int id;
    private String nombre;
    private int edad;
    private String puesto;
    private boolean indefinido;

    public PersonalG(int i, String n, int e, String p, boolean ind){
        id = i;
        nombre = n;
        edad = e;
        puesto = p;
        indefinido = ind;
    }

    public verdatos(){
        logger.info("id: ", id);
        logger.info("nombre: ", nombre);
        logger.info("edad: ", edad);
        logger.info("puesto: ", puesto);
        logger.info("indefinido: ", indefinido);

    }
}