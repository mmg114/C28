package Clase2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
             System.out.println("Digite su nombre");
             String nombre =scanner.next();
             System.out.println("Nombre: "+nombre);
             System.out.println("Digite su Edad");
             int edad =scanner.nextInt();
             System.out.println("Edad: "+edad);
        }catch (Exception e) {
             System.out.println(e);
        }
        finally {
            scanner.close();
        }



         Persona persona = new Persona();
        persona.setEdad(31);
        persona.setGenero("NO BINARIO");
        persona.setNombreCompleto("Camilo");

        Persona.correr();

//        System.out.println("la edad de la persona es: " +persona.getEdad());
//        System.out.println("la Nombre completo es: " +persona.getNombreCompleto());
//        System.out.println("su Genero es: " +persona.getGenero());


    }

}
