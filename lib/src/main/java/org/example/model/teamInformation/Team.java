package org.example.model.teamInformation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team{
    private String id;
    private String name;
    private String code;
    private String country;
    private String founded;
    private String national;
    private String logo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }

    public String getFounded() {
        return founded;
    }
    
    public String getLogo() {
        return logo;
    }
    
    public String getNational() {
        return national;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public void setFounded(String founded) {
        this.founded = founded;
    }
    
    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    public void setNational(String national) {
        this.national = national;
    }
    
}

