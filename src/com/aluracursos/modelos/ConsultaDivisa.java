package com.aluracursos.modelos;

import com.google.gson.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;


public class ConsultaDivisa {
    public ArrayList consulta() throws IOException {
        // Setting URL
        String url_str = "https://v6.exchangerate-api.com/v6/6f14b9dfa5a28de3fcdef85c/latest/USD";

        // Making Request
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        // Accessing object
        JsonObject req_result = jsonobj.get("conversion_rates").getAsJsonObject();
        ArrayList<Double> divisas = new ArrayList<Double>();
        divisas.add(req_result.get("ARS").getAsDouble());
        divisas.add(req_result.get("BRL").getAsDouble());
        divisas.add(req_result.get("COP").getAsDouble());
        divisas.add(req_result.get("USD").getAsDouble());
        System.out.println("Impresion de la lista de divisas: " + divisas);

        return divisas;
    }
}
