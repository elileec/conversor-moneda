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
            System.out.println("7) Para finalizar");
            opcion = leerOpcion.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Estoy en la conversión de dolar a pesos argentinos");
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