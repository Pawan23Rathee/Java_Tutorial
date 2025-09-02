import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
class A{
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
            
            
            HttpURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("GET");




            int responseCode = conn.getResponseCode();
            System.out.print("ResponseCode " + responseCode);

            BufferedReader in = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
            );

            String inputLine;
            StringBuffer response = new StringBuffer();

            while((inputLine = in.readLine()) != null){
                response.append(inputLine);

            }
            in.close();

             JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();

            // ✅ Access fields
            System.out.println("ID: " + jsonObject.get("id").getAsInt());
            System.out.println("Title: " + jsonObject.get("title").getAsString());
            System.out.println("Body: " + jsonObject.get("body").getAsString());



        } catch (Exception e) {
            e.printStackTrace();
        }
    }}
