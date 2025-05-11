package moneda;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class CambiarMoneda {

  public static void cambiar(String base_code, String target_code) throws IOException, InterruptedException {
    double valor; // variablea para almacenar el valor a convertir
    double valorFinal; // variable que almacena el valor de la conversion
    Scanner leer = new Scanner(System.in);
    System.out.println("INGRESE EL VALOR A CONVERTIR EN: "+base_code);
    valor = leer.nextDouble();



    // consumo de la API
    // analisis respuesta json
    // calculo conversion de la moneda y muestra del resultado
    String direccion = "https://v6.exchangerate-api.com/v6/ebabc15432c2a2d18242d857/pair/"+base_code+"/"+target_code;

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
    String json = response.body();

    Gson gson = new Gson();
    MonedaOmdb miConversor;
    miConversor = gson.fromJson(json, MonedaOmdb.class);
    valorFinal = miConversor.conversion_rate()*valor;
    String resultado = String.format("%.7f", valorFinal); //permite ver el resultado hasta con 7 decimales
    System.out.println("\n ***************************************************");
    System.out.println(valor+" "+base_code+" es igual a:  "+resultado+" "+target_code);
  }






}
