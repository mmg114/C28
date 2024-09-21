package Clase7;


import java.util.logging.Level;
import java.util.logging.Logger;

    public class EjemploLog {

        // Crear un logger para la clase actual
        private static final Logger logger = Logger.getLogger(EjemploLog.class.getName());

        public static void main(String[] args) {

            try {
                int resultado = dividir(10, 0);  // Esto causará una excepción
            } catch (ArithmeticException e) {
                // Loggear la excepción
                logger.log(Level.SEVERE, "Error al dividir por cero: {0}", e.toString());
            }
        }

        // Método para dividir dos números
        public static int dividir(int a, int b) {
            return a / b;  // Esto lanzará una ArithmeticException si b es 0
        }
    }

