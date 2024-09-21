package Clase6;

public class Rectangulo implements FiguraGeometrica{

    @Override
    public void calcularArea(int lado1, int lado2) {
        System.out.println(lado1*lado2);
    }
}
