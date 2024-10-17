package Classes;

import java.io.FileWriter;
import java.io.IOException;

public class EjemploFinallyUse {

    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("archivo.txt");
            writer.write("Escribiendo en el archivo...");
            System.out.println("Escritura exitosa");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        } finally {
            try {
                if (writer != null) {
                    writer.close(); // Siempre se ejecuta, haya o no excepción, lo que hace que el archivo se cierre
                    System.out.println("Archivo cerrado correctamente");
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
}