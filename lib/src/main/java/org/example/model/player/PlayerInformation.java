package org.example.model.player;

import java.util.List;

import org.example.model.teamInformation.Parameters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerInformation {
    private String get;
    private List<String> errors;
    private int results;
    private Parameters parameters;

    @JsonProperty("response")
    private List<PlayerData> response;

    public List<PlayerData> getResponse() {
        return response;
    }

    public void setResponse(List<PlayerData> response) {
        this.response = response;
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

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "get: ";
    }
}
