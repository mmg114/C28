package Clase2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nombre =scanner.next();
        System.out.println("Nombre: "+nombre);

        System.out.println("Digite su Edad");
        int edad =scanner.nextInt();
        System.out.println("Edad: "+edad);

        scanner.close();


        Persona persona1 = new Persona("Mauricio");

        System.out.println(persona1.nombreCompleto);
    }

}
