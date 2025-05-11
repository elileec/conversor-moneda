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
        //la variable eleccion almacena el valor que selecciona el usuario
        //el metodo cambiar moneda.acambiar llama la clase y el metodo con las monedas a calcular

        Scanner leerOpcion = new Scanner(System.in);
        int eleccion = 0;

        while(eleccion != 7){
            System.out.println("*****************************************");
            System.out.println(" BIENVENIDO AL PROGRAMA CONVERSOR DE MONEDA ");
            System.out.println("1) Dolar a Peso Argentino");
            System.out.println("2) Peso Argentino a Dolar");
            System.out.println("3) Dolar a Real Brasileño");
            System.out.println("4) Real Brasileño a Dolar");
            System.out.println("5) Dolar a Peso Colombiano");
            System.out.println("6) Peso Colombiano a Dolar");
            System.out.println("7) Para finalizar");
            System.out.println("Seleccione una opción valida: ");
            eleccion = leerOpcion.nextInt();
            leerOpcion.nextLine();
            switch (eleccion){
                case 1:
                    CambiarMoneda.cambiar("USD","ARS");
                    break;
                case 2:
                    CambiarMoneda.cambiar("ARS","USD");
                    break;
                case 3:

                    CambiarMoneda.cambiar("USD","BRL");
                    break;
                case 4:
                    CambiarMoneda.cambiar("BRL","USD");
                    break;
                case 5:
                    CambiarMoneda.cambiar("USD","COP");
                    break;
                case 6:
                    CambiarMoneda.cambiar("COP","USD");
                    break;
                case 7:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("La opción ingresa no es valida");
                    break;

            }
        }

    }

}