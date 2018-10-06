package com.example.shoko.dreamapp_girls;

public class Person {
    private String name;
    private String image;
    private String summary;
    private String motto;
    private int age;
    private String belong;
    private String belongReason;
    private CareerPass[] careerPass;
    private int turningPointIndex;

    public Person(String name, String image, String summary, String motto, int age, String belong, String belongReason, CareerPass[] careerPass, int turningPointIndex) {
        this.name = name;
        this.image = image;
        this.summary = summary;
        this.motto = motto;
        this.age = age;
        this.belong = belong;
        this.belongReason = belongReason;
        this.careerPass = careerPass;
        this.turningPointIndex = turningPointIndex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getBelongReason() {
        return belongReason;
    }

    public void setBelongReason(String belongReason) {
        this.belongReason = belongReason;
    }

    public CareerPass[] getCareerPass() {
        return careerPass;
    }

    public void setCareerPass(CareerPass[] careerPass) {
        this.careerPass = careerPass;
    }

    public int getTurningPointIndex() {
        return turningPointIndex;
    }

    public void setTurningPointIndex(int turningPointIndex) {
        this.turningPointIndex = turningPointIndex;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}