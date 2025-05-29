import com.google.gson.JsonObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            JsonObject exchangeRates = ApiClient.getExchangeRates();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nMenú:");
                System.out.println("1. Convertir moneda");
                System.out.println("2. Salir");
                System.out.print("Selecciona una opción: ");
                int option = scanner.nextInt();

                if (option == 1) {
                    CurrencyConverter.convertCurrency(exchangeRates);
                } else {
                    System.out.println("¡Gracias por usar el conversor!");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al obtener datos de la API: " + e.getMessage());
        }
    }
}
