import com.google.gson.JsonObject;

public class ExchangeRateService {
    public static double getRate(String currency, JsonObject jsonRates) {
        return jsonRates.getAsJsonObject("conversion_rates").get(currency).getAsDouble();
    }
}
