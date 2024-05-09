package com.aluracursos.modelos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ColsultaDivisa {
    //Clase que genera la consulta de la API
    public Moneda buscaDivisa(int numeroDivisa){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/6f14b9dfa5a28de3fcdef85c/latest/USD");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("Moneda no encontrada");
        }
    }
}
