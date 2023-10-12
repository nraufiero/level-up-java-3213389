package com.linkedin.javacodechallenges;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        // TODO: Call https://icanhazdadjoke.com/ API and display joke
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://icanhazdadjoke.com/"))
                .header("accept", "application/json")
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        if (response.statusCode() == 200) {
            JSONObject myObject = new JSONObject(response.body());
            try {
                System.out.println(myObject.get("joke"));
            } catch(JSONException e) {
                System.out.println("No joke in response");
            }
        }
    }
}
