package org.example;

import java.io.IOException;

import org.example.api.FootballAPI;
import org.example.model.player.PlayerInformation;
import org.example.model.teamInformation.TeamInformation;
import org.example.model.teamStatistics.TeamStatistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FootballApiTest {
    
    @Test 
    void createApiObject() {
        var apiKey = System.getenv("API_KEY");

        var api = new FootballAPI(apiKey);

        Assertions.assertNotNull(api);
    }

    @Test
    void getTeamInformationById121() throws IOException, InterruptedException {
        var apiKey = System.getenv("API_KEY");
        var api = new FootballAPI(apiKey);

        TeamInformation teamInformation = api.getTeamInformationById("121");

        Assertions.assertEquals("teams", teamInformation.getGet());
        Assertions.assertEquals("121", teamInformation.getParameters().getId());
        Assertions.assertEquals("Palmeiras", teamInformation.getResponse().get(0).getTeam().getName());
        System.out.println(teamInformation);
    }

    @Test
    void getPlayersInformationByTeamId121() throws IOException, InterruptedException {
        var apiKey = System.getenv("API_KEY");
        var api = new FootballAPI(apiKey);

        PlayerInformation playerInformation = api.getPlayerInformationByTeamId("121");

        Assertions.assertEquals("players", playerInformation.getGet());
        Assertions.assertEquals(20, playerInformation.getResults());
        Assertions.assertEquals("121", playerInformation.getParameters().getTeam());
        Assertions.assertEquals("Weverton", playerInformation.getResponse().get(0).getPlayer().getFirstname());
        
        System.out.println(playerInformation);
    }

    @Test
    void getTeamStatisticsByTeamId121() throws IOException, InterruptedException {
        var apiKey = System.getenv("API_KEY");
        var api = new FootballAPI(apiKey);

        TeamStatistics teamStatistics = api.getTeamStatisticsById("121");

        Assertions.assertEquals("teams/statistics", teamStatistics.getGet());
        Assertions.assertEquals("121", teamStatistics.getParameters().getTeam());
        System.out.println(teamStatistics);
    }
    
}
