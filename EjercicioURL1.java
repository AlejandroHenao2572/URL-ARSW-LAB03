import java.io.*;
import java.net.*;


public class EjercicioURL1 {
    public static void main (String[] args) throws Exception{
        //El formato general de url (El de la guia ) esta deprecado el formato normal ahora es : 
        //URL "nombre" = URI.create("URL a consutlar ").toURL();
        URL pataconURL = URI.create("https://docs.oracle.com/javase/tutorial/networking/index.html.").toURL();
        
        //Imprimir el protocolo de la URL
        System.out.println(pataconURL.getProtocol());
        //Imprimir la autoridad el URL
        System.out.println(pataconURL.getAuthority());
        //Imprimir el host 
        System.out.println(pataconURL.getHost());
        //Imprimir el puerto 
        System.out.println(pataconURL.getPort());
        //Imprimir el Path
        System.out.println(pataconURL.getPath());
        //Imprimir el Query
        System.out.println(pataconURL.getQuery());
        //Imprimir el File
        System.out.println(pataconURL.getFile());
        //Imprimir la referencia
        System.out.println(pataconURL.getRef());
        


    }
}