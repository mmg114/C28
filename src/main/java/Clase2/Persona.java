package Clase2;

public class Persona {

    public Persona(){
    }

    Persona(String nombreCompleto){
        this.nombreCompleto=nombreCompleto;
    }

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

    //static
    public String correr(){
       return "Estoy corriendo";
    }
    public String saltar(){
        return "Estoy saltando";
    }
    public  String nadar(){
        return "Estoy nadando";
    }
    public void escalar(){

    }
}
