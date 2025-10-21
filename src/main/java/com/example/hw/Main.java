package com.example.hw;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", 2021);
        Gson gson = new Gson();
        System.out.println(gson.toJson(car));
    }

    static class Car {
        String brand;
        int year;
        Car(String brand, int year)
        {
            this.brand = brand;
            this.year = year;
        }
    }
}