package Clase7;

import java.util.List;
import java.util.Locale;

public class StreamEjemplo {



    public static void main(String[] args) {
        List<String> myLista = List.of("Mauricio","Carolina","James");
       /* for (String nombre: myLista){
            System.out.println(nombre.toUpperCase(Locale.ROOT));
        }*/

       // myLista.stream().forEach(tmp-> System.out.println(tmp.toUpperCase(Locale.ROOT)));
       //  myLista.forEach(tmp-> System.out.println(tmp.toUpperCase(Locale.ROOT)));
        myLista.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        List<Integer> myListaNumerica = List.of(8,5,7,1,10);

        myListaNumerica.stream()
                .filter(n->n>=5)
                .sorted()
                .limit(3)
                .forEach(System.out::println);

    }







}
