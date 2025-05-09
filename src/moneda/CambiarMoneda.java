package moneda;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CambiarMoneda {

  public static void cambiar(String base_code, String target_code, double cantidad) throws IOException, InterruptedException {
    System.out.println("VALORES RECIBOS "+ base_code + target_code+" y la cantidad "+cantidad);

    System.out.println("Estoy en la conversión de dolar a pesos argentinos");
    String direccion = "https://v6.exchangerate-api.com/v6/ebabc15432c2a2d18242d857/pair/"+base_code+"/"+target_code;
    System.out.println("la direccion es "+ direccion);
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
    String json = response.body();
    System.out.println(json);
    Gson gson = new Gson();
    MonedaOmdb miConversor;
    miConversor = gson.fromJson(json, MonedaOmdb.class);
    //System.out.println(cantidad+" "+base_code+" convertido a "+target_code +" equivale a "+ miConversor.conversion_rate()*cantidad+"  ");
    System.out.println(cantidad+" "+base_code+" es igual a:  "+miConversor.conversion_rate()*cantidad+" "+target_code);
  }






}
