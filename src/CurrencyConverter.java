import com.google.gson.JsonObject;

import java.util.Scanner;

public class CurrencyConverter {
    public static void convertCurrency(JsonObject exchangeRates) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cantidad en soles: ");
        double amount = scanner.nextDouble();

        System.out.println("\nMonedas disponibles:");
        System.out.println("1. BRL - Real Brasileño");
        System.out.println("2. ARS - Peso Argentino");
        System.out.println("3. VES - Bolívar Venezolano");
        System.out.println("4. UYU - Peso Uruguayo");
        System.out.println("5. PYG - Guaraní Paraguayo");
        System.out.println("6. CLP - Peso Chileno");
        System.out.println("7. BOB - Boliviano");
        System.out.println("8. COP - Peso Colombiano");
        System.out.println("9. Salir");

        System.out.print("Seleccione la moneda destino: ");
        int option = scanner.nextInt();

        String[] currencies = {"BRL", "ARS", "VES", "UYU", "PYG", "CLP", "BOB", "COP"};
        if (option >= 1 && option <= 8) {
            String currency = currencies[option - 1];
            double rate = ExchangeRateService.getRate(currency, exchangeRates);
            double result = amount * rate;
            System.out.println(amount + " soles equivalen a " + result + " " + currency);
            JsonManager.saveConversion(currency, amount, result);
        } else {
            System.out.println("Saliendo del programa...");
        }
    }
}
