package Clase2;

public class Persona {

    public Persona(){
    }

    Persona(String nombreCompleto){
        this.nombreCompleto=nombreCompleto;
    }

    private static int id;
    private String nombreCompleto;
    private int edad;
    private String genero;
    private String identificacion;
    private String  tipoDocumento;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public static String correr(){
       return "Estoy corriendo";
    }
    public String saltar(){
        return "Estoy saltando";
    }
    public  String nadar(){
        return "Estoy nadando";
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Persona.id = id;
    }
}
