import java.io.BufferedReader;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.io.InputStreamReader;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser; // Add this import

class AP {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");

            HttpURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int response = conn.getResponseCode();
            System.out.println("Response: " + response);

            BufferedReader nextLine = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder jsonResponse = new StringBuilder();
            String line;
            while ((line = nextLine.readLine()) != null) {
                jsonResponse.append(line);
            }
            nextLine.close();

            // Parse the JSON response string
            JsonObject jsonObject = JsonParser.parseString(jsonResponse.toString()).getAsJsonObject();
            System.out.println("Parsed JSON: " + jsonObject);

        } catch (Exception e) {
            e.printStackTrace(); // Print the exception for debugging
        }
    }
}