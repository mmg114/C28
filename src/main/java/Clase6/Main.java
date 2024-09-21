package Clase6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int contador=0;
        while(contador<=5){
            System.out.println("Valor contador :" +contador);
            contador++; // === //      contador = contador +1;
        }
        System.out.println("""
                
                Aca termina el while
                y empieza el do while
                """);
        contador=0;

        do{
            System.out.println("Valor contador :" +contador);
            contador++; // === //      contador = contador +1;
        } while (contador<=5);

        System.out.println("""
                
                Aca termina el Do while
                y empieza el for
                """);

        for(int i=1;i<=10;i+=2){
            System.out.println("Numeros :" +i);
        }

        String[] arregloPalabras = new String[2];

        arregloPalabras[0]= "Mauricio";
        arregloPalabras[1]= "Sara";
        List<String> myList= List.of("Perros calientes", "Arepa", "Carne asada");
        System.out.println("""
                
                Arreglo
                """);
        for(int i =0;i< arregloPalabras.length;i++){
            System.out.println("Valor arreglo: "+arregloPalabras[i]);
        }
        System.out.println("""
                
                Listas
                """);
        for(int i =0;i< myList.size();i++){
            System.out.println("Valor Lista: "+myList.get(i));
        }
        System.out.println("""
                
                fori
                """);
        for(String comidas:myList){
            System.out.println(comidas);
        }

        try{
            System.out.println(arregloPalabras[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (RuntimeException e){
            System.out.println(e);
        }

    }




}
