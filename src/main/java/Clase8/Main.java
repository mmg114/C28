package Clase8;

public class Main {
    public static void main(String[] args) {
        PersonaService p = new PersonaService();
        p.actualizarPersonasV2();

        ErroresDelSitema e = ErroresDelSitema.getForKey(1);
        System.out.println(e);

    }
}
