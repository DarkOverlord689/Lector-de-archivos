package util;

/**
 *
 * @author DarkOverlord689
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Archivo {

    public static ArrayList<String> leerArchivo(String archivo) {
        ArrayList<String> lineas = new ArrayList();

        try {
            FileReader flujo = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(flujo);

            String linea = buffer.readLine();
            while (linea != null) {
                lineas.add(linea);
                linea = buffer.readLine();
            }
            buffer.close();
            flujo.close();
        } catch (IOException e) {
            System.out.println("Error de archivo: " + e);
            System.exit(-1);
        }

        return lineas;
    }

    public static void grabarArchivo(String archivo, ArrayList<String> lineas) {
        try {
            FileWriter flujo = new FileWriter(archivo);
            BufferedWriter buffer = new BufferedWriter(flujo);

            for (String linea : lineas) {
                buffer.write(linea);
                buffer.newLine();
            }

            buffer.close();
            flujo.close();
        } catch (IOException e) {
            System.out.println("Error de archivo: " + e);
            System.exit(-1);
        }
    }
}
