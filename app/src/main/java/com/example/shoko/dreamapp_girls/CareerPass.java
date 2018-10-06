package com.example.shoko.dreamapp_girls;

public class CareerPass {
    private int age;
    private String text;

    public CareerPass(int age, String text){
        this.age = age;
        this.text = text;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}