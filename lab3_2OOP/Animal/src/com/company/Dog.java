package com.company;
//package com.journaldev.inheritance;

public class Dog extends Animal {
    private String color;

    public Dog(boolean w, String n, int l){
        super(n, w, l);
        this.color = "Brown";
    }

    public Dog(boolean w, String n, int l, String color){
        super(n, w, l);
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
