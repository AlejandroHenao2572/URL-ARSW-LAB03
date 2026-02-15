import java.io.*;
import java.net.*;

public class EjercicioURL2 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese la URL: ");
        String userUrlInput = reader.readLine();

        URL url = null;
        
        try{
            url = URI.create(userUrlInput).toURL();

            try (
                BufferedReader UrlReader = new BufferedReader(new InputStreamReader(url.openStream())); 
                BufferedWriter UrlWriter = new BufferedWriter(new FileWriter("resultado.html"))
            ) {
                String inputLine = null;
                while((inputLine = UrlReader.readLine()) != null){
                    UrlWriter.write(inputLine); //Escribir en el archivo html
                    UrlWriter.newLine(); //Agregar una nueva linea
                }
                System.out.println("\nContenido guardado en resultado.html");
            } catch (Exception e) {
                System.err.println(e);
            }

        } catch (Exception e) {
            System.err.println("La URL ingreasada no es valida");
        }


    }
}