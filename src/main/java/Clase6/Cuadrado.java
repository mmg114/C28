package Clase6;

public class Cuadrado implements FiguraGeometrica{


    @Override
    public void calcularArea(int lado1, int lado2) {
        System.out.println(lado1*lado1);
    }
}
