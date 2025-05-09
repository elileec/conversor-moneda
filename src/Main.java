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
        double cantidad =0;
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
            System.out.println("Ingrese la cantidad: ");
            cantidad = leerOpcion.nextDouble();

            switch (eleccion){
                case 1:

                    CambiarMoneda.cambiar("USD","ARS", cantidad);

                    System.out.println("Estoy en la conversión de dolar a pesos argentinos");
                    String direccion = "https://v6.exchangerate-api.com/v6/ebabc15432c2a2d18242d857/pair/USD/COP";
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(direccion))
                            .build();
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    System.out.println(json);
                   Gson gson = new Gson();
                    CambiarMoneda miConversor;
                    miConversor = gson.fromJson(json, CambiarMoneda.class);

                    break;
                case 2:
                    System.out.println("Estoy en la conversion de peso argetino a dolar");
                    break;
                case 3:
                    System.out.println("Estoy en la conversion dolar a reala brasileño");
                    break;
                case 4:
                    System.out.println("Estoy en la conversion de real brasil a dolar");
                    break;
                case 5:
                    System.out.println("Estoy conversion dolar a peso colombiano");
                    break;
                case 6:
                    System.out.println("Estoy conversion peso colombiano a dolar");
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