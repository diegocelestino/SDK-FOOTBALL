package org.example.model.player;

public class Player {
    private String id;
    private String name;
    private String firstname;
    private String lastname;
    private String age;
    private Birth birth;
    private String nationality;
    private String height;
    private String weight;
    private String injured;
    private String photo;

    public String getAge() {
        return age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }

    public Birth getBirth() {
        return birth;
    }

    public void setBirth(Birth birth) {
        this.birth = birth;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getInjured() {
        return injured;
    }

    public void setInjured(String injured) {
        this.injured = injured;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


}
