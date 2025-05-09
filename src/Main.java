import com.google.gson.Gson;
import moneda.CambiarMoneda;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
    //incio programa//
        Scanner leerOpcion = new Scanner(System.in);
        double valor =0;
        int eleccion = 0;

        while(eleccion != 7){
            System.out.println("*****************************************");
            System.out.println("Sea bienvenido al conversor de moneda**");

            System.out.println("1) Dolar a Peso Argentino");
            System.out.println("2) Peso Argentino a Dolar");
            System.out.println("3) Dolar a Real Brasileño");
            System.out.println("4) Real Brasileño a Dolar");
            System.out.println("5) Dolar a Peso Colombiano");
            System.out.println("6) Peso Colombiano a Dolar");
            System.out.println("7) Para finalizar");
            eleccion = leerOpcion.nextInt();
            leerOpcion.nextLine();
            System.out.println("Ingrese valor a convertir: ");
            valor = leerOpcion.nextDouble();

            switch (eleccion){
                case 1:

                    CambiarMoneda.cambiar("USD","ARS", valor);
                    break;
                case 2:
                    CambiarMoneda.cambiar("ARS","USD", valor);
                    break;
                case 3:

                    CambiarMoneda.cambiar("USD","BRL", valor);
                    break;
                case 4:
                    CambiarMoneda.cambiar("BRL","USD", valor);
                    break;
                case 5:
                    CambiarMoneda.cambiar("USD","COP", valor);
                    break;
                case 6:
                    CambiarMoneda.cambiar("COP","USD", valor);
                    break;
                case 7:
                    System.out.println("finalizacion del programa");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;



                
            }
        }
        System.out.println("SALI DEL WHILE");
    }

}