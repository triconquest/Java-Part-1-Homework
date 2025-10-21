package com.example.hw;

import com.google.gson.Gson;

public class Main {

    interface Vehicle{
        void drive();
    }

    public static void main(String[] args) {
        Gson gson = new Gson();

        // anonymous class 1, replacing Car
        Vehicle car = new Vehicle() {
            final String brand = "Ford";
            final int year = 2021;

            @Override
            public void drive()
            {
                System.out.println("Driving " + brand + " (" + year + ")");
            }

            @Override
            public String toString()
            {
                return "{ \"brand\": \"" + brand + "\", \"year\": " + year + " }";
            }
        };

        System.out.println("Car JSON: " + gson.toJson(car.toString()));
        car.drive();

        // anonymous 2, replacing Engine
        Vehicle engine = new Vehicle() {
            final String type = "V8";

            @Override
            public void drive() {
                System.out.println("Engine running: " + type);
            }
        };
        engine.drive();

        // anonymous 3 replacing the CarChecker
        Vehicle checker = () -> System.out.println("Inspecting the car... looks good!");
        checker.drive();

        // lambda expression
        Vehicle electricVehicle = () -> System.out.println("Driving an electric vehicle silently (lambda version)");
        electricVehicle.drive();
    }
}