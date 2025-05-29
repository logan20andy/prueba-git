import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class JsonManager {
    private static final String FILE_PATH = "historial.json";

    public static void saveConversion(String currency, double amount, double convertedAmount) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonArray conversionHistory;

        try (FileReader reader = new FileReader(FILE_PATH)) {
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
            conversionHistory = jsonObject.getAsJsonArray("historial_conversiones");
        } catch (Exception e) {
            conversionHistory = new JsonArray();
        }

        JsonObject newConversion = new JsonObject();
        newConversion.addProperty("moneda_origen", "PEN");
        newConversion.addProperty("moneda_destino", currency);
        newConversion.addProperty("cantidad", amount);
        newConversion.addProperty("resultado", convertedAmount);
        newConversion.addProperty("fecha", LocalDateTime.now().toString());

        conversionHistory.add(newConversion);

        JsonObject updatedJson = new JsonObject();
        updatedJson.add("historial_conversiones", conversionHistory);

        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(updatedJson, writer);
        } catch (IOException e) {
            System.out.println("Error guardando en JSON: " + e.getMessage());
        }
    }

}
