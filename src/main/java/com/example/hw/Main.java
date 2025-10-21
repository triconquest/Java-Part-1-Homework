package com.example.hw;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        // static nested class example
        Car car = new Car("Ford", 2021);
        Gson gson = new Gson();

        System.out.println("Static nested class JSON: " + gson.toJson(car));

        // inner class
        Car.Engine engine = car.new Engine("V8");
        System.out.println("Inner class:  Engine type - " + engine.getType());

        // local class example
        class CarChecker{
            void Inspect(Car c)
            {
                System.out.println("Checking car: " + c.brand + " (" + c.year + ")");
            }
        }
        CarChecker checker = new CarChecker();
        checker.Inspect(car);

        // anonymous class example
        Vehicle electricVehicle = new Vehicle() {
            @Override
            public void Drive() {
                System.out.println("Driving an electric vehicle!");
            }
        };
        electricVehicle.Drive();
    }

    // static nested class
    static class Car {
        String brand;
        int year;
        Car(String brand, int year)
        {
            this.brand = brand;
            this.year = year;
        }

        // non-static inner class
        class Engine
        {
            private String type;

            Engine(String type) { this.type = type; }

            public String getType()
            {
                return type;
            }
        }
    }

    interface Vehicle
    {
        void Drive();
    }
}