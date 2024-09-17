package Clase2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
  /*      Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nombre =scanner.next();
        System.out.println("Nombre: "+nombre);

        System.out.println("Digite su Edad");
        int edad =scanner.nextInt();
        System.out.println("Edad: "+edad);

        scanner.close();
*/
        Persona persona = new Persona();
        persona.setEdad(31);
        persona.setGenero("NO BINARIO");
        persona.setNombreCompleto("Camilo");

        System.out.println("la edad de la persona es: " +persona.getEdad());
        System.out.println("la Nombre completo es: " +persona.getNombreCompleto());
        System.out.println("su Genero es: " +persona.getGenero());


    }

}
