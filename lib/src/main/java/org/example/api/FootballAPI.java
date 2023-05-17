package org.example.api;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.example.model.player.PlayerInformation;
import org.example.model.teamInformation.TeamInformation;
import org.example.model.teamStatistics.TeamStatistics;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FootballAPI {
    private final String API_URL;
    private String apiKey;
    private HttpClient client;
    private ObjectMapper mapper;

    public FootballAPI(String apiKey) {
        this.apiKey = apiKey;
        this.API_URL = "https://api-football-v1.p.rapidapi.com/v3/";
        this.client = HttpClient.newHttpClient();
        this.mapper = new ObjectMapper();
    }


    public TeamInformation getTeamInformationById(String id) throws IOException, InterruptedException {
        URI uri = URI.create(API_URL + "teams?id=" + id);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        TeamInformation teamInformation = mapper.readValue(response.body(), TeamInformation.class);
        return teamInformation;
    }

    public PlayerInformation getPlayerInformationByTeamId(String id) throws IOException, InterruptedException {
        //missing season parameter
        URI uri = URI.create(API_URL + "players?team=" + id  + "&season=2023");
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        PlayerInformation playerInformation = mapper.readValue(response.body(), PlayerInformation.class);
        return playerInformation;
    }

    public TeamStatistics getTeamStatisticsById(String id) throws IOException, InterruptedException {
        //missing league and season parameters
        URI uri = URI.create(API_URL + "teams/statistics?league=71&season=2023&team=" + id);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        TeamStatistics teamStatistics = mapper.readValue(response.body(), TeamStatistics.class);
        return teamStatistics;
    }


    private HttpRequest generateRequest(URI uri) {
        return HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .header("X-RapidAPI-Key", this.apiKey)
		        .header("X-RapidAPI-Host", "api-football-v1.p.rapidapi.com")
                .header("Content-Type", "application/json")
                .build();
    }

    private HttpResponse<String> getResponse(HttpRequest request) throws IOException, InterruptedException {
        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }

}