package org.example.model.teamStatistics;

import java.util.List;

import org.example.model.teamInformation.Parameters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamStatistics {
    private String get;
    private List<String> errors;
    private int results;
    private Parameters parameters;
    
    @JsonProperty("response")
    private TeamStatisticsData response;

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
    
    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public TeamStatisticsData getResponse() {
        return response;
    }

    public void setResponse(TeamStatisticsData response) {
        this.response = response;
    }


    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }
        
}
