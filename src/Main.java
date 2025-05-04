import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //incio programa//
        Scanner leerOpcion = new Scanner(System.in);
        int opcion = 0;

        while(opcion != 7){
            System.out.println("*****************************************");
            System.out.println("Sea bienvenido al conversor de moneda**");

            System.out.println("1) Dolar a Peso Argentino");
            System.out.println("2) Peso Argentino a Dolar");
            System.out.println("3) Dolar a Real Brasileño");
            System.out.println("4) Real Brasileño a Dolar");
            System.out.println("5) Dolar a Peso Colombiano");
            System.out.println("6) Peso Colombiano a Dolar");
            System.out.println("Ingrese valor 7 para salir");
            opcion = leerOpcion.nextInt();

            switch (opcion){
                
            }
        }
        System.out.println("SALI DEL WHILE");
    }

}