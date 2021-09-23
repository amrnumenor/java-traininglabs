package com.example;

interface VehicleInterface {
    // all methods are abstract by default
    public void brake();
    public void accelerate();
}


class CarInterface implements VehicleInterface {

    public void brake() {
        System.out.println("The car is slowing down");
    }

    public void accelerate() {
        System.out.println("The car is accelerating");
    }
}

public class MyInterface {
    public static void main(String[] args) {
        CarInterface car = new CarInterface();
        car.accelerate();
        car.brake();
    }
}
