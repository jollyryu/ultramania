package com.ryu.ultramania.model;

import lombok.Data;

@Data
public class Car {
    private String name;
    private String color;

    public Car(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Car(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Car{" + "name='" + name + '\'' + ", color='" + color + '\'' + '}';
    }
}
