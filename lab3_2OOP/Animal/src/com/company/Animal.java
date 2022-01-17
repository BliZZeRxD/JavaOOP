package com.company;


public class Animal {
    public String name;
    public boolean wild;
    public int legs;

    public Animal(){}

    public Animal(String n, boolean w, int l){
        this.name = n;
        this.wild = w;
        this.legs = l;
    }

    public boolean isWild(){
        return wild;
    }
    public void setWild(boolean wild){
        this.wild = wild;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getLegs(){
        return legs;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }


}
