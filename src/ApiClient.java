import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiClient {
    public static JsonObject getExchangeRates() throws Exception {
        String apiUrl = "https://v6.exchangerate-api.com/v6/d294149452a97b3cc8a77405/latest/PEN";
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        JsonParser parser = new JsonParser();
        return parser.parse(new InputStreamReader(conn.getInputStream())).getAsJsonObject();
    }
}
