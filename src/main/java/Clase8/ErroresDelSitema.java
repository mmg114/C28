package Clase8;

public enum ErroresDelSitema {
   ERROR_404(1,"ESTE ERROR ES MUY GRAVE");

    private final int id;
    private final String nombre;

    ErroresDelSitema(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public static ErroresDelSitema getForKey(int id){
        for (ErroresDelSitema e : ErroresDelSitema.values()){
            if (e.id == id) {
                return e;
            }
        }
        throw new RuntimeException("No encontro nada");
    }
}
