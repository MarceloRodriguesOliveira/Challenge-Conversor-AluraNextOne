package org.ConversorApp.connection;

import io.github.cdimascio.dotenv.Dotenv;
import org.ConversorApp.dto.ConversionRequest;
import org.ConversorApp.dto.ConversionResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpApiConnection {
    Dotenv dotenv = Dotenv.load();
    String apiKey = dotenv.get("API_KEY");

    public String buildUrl(ConversionRequest request){
        return String.format(
                "https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/%s",
                apiKey,
                request.baseCurrency(),
                request.targetCurrency(),
                Double.toString(request.amount())
        );
    }

    public void response(ConversionRequest request) throws IOException, InterruptedException {
        String address = buildUrl(request);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(address)).GET().build();

        HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }

}
