package com.example.demo.Items;

import lombok.Getter;
import lombok.Setter;


@Setter
public class Flower extends Item{
    String description;
    @Getter
    private double sepalLength;
    @Getter
    private FlowerType flowerType;
//    String description = super.description;
    private FlowerColor color;
    private double price;
    public double getPrice() {
        return price;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    public String getColor() {
        return color.toString();
    }
    public String toString() {
        return getDescription();
    }
    @Override
    public double price() {
        return price;
    }

}
