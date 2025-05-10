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
    double valor;
    double valorFinal;
    Scanner leer = new Scanner(System.in);
    System.out.println("INGRESE EL VALOR A CONVERTIR EN: "+base_code);
    valor = leer.nextDouble();

   // System.out.println("VALORES RECIBOS "+ base_code + target_code+" y la cantidad "+valor);


    String direccion = "https://v6.exchangerate-api.com/v6/ebabc15432c2a2d18242d857/pair/"+base_code+"/"+target_code;
   // System.out.println("la direccion es "+ direccion);
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
    String json = response.body();
   // System.out.println(json);
    Gson gson = new Gson();
    MonedaOmdb miConversor;
    miConversor = gson.fromJson(json, MonedaOmdb.class);
    valorFinal = miConversor.conversion_rate()*valor;
    System.out.println("\n ***************************************************");
    System.out.println(valor+" "+base_code+" es igual a:  "+valorFinal+" "+target_code);
  }






}
