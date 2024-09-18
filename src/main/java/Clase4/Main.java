package Clase4;

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
    }
}
