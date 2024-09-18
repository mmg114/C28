package Clase4;

import Clase3.Moto;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int edad =0;
        String nombre= "Mauricio";

        if(edad >=18){
            System.out.println("Es mayor de edad");
            if (nombre.equals("Mauricio")){
                System.out.println("No le permitan la entrada");
            }
        } else {
            System.out.println("Es menor de edad");
        }
         var esVerdad= edad >=18 ?true:false;

        int day = 3;

        String dayName1 = switch (day) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };

        System.out.println("El día es: " + dayName1);

    String dayName;

    // Usando switch para determinar el día de la semana
        switch (day) {
        case 1:
            dayName = "Lunes";
            break;
        case 2:
            dayName = "Martes";
            break;
        case 3:
            dayName = "Miércoles";
            break;
        case 4:
            dayName = "Jueves";
            break;
        case 5:
            dayName = "Viernes";
            break;
        case 6:
            dayName = "Sábado";
            break;
        case 7:
            dayName = "Domingo";
            break;
        default:
            dayName = "Día inválido";
            break;
    }

        System.out.println("El día es: " + dayName);



        int[] arreglo = new int[5];
        String[] arregloPalabras = new String[5];
        String[] arregloPalabras2 = new String[5];
        Moto[] misMotos= new Moto[200];


        Long[] miArregloLong;








        miArregloLong= new Long[10];

        List<String> miLista = new ArrayList<>();
        miLista.add("Hola");
        miLista.add("Hola");
        miLista.add("Hola");
        miLista.add("Hola");
        miLista.add("Hola");


    }
}
