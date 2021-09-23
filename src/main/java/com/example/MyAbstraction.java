package com.example;

abstract class VehicleAbstraction {
    // can contain both abstract & non-abstract methods

    public VehicleAbstraction() {
        System.out.println("Vehicle constructor is called");
    }

    public abstract void brake(); // abstract method

    public void accelerate() { // non-abstract method
        System.out.println("The vehicle is accelerating");
    }
}

class CarAbstraction extends VehicleAbstraction {
    public CarAbstraction(){};

    public void brake() {
        System.out.println("The car is slowing down");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating");
    }
}

public class MyAbstraction {
    public static void main(String[] args) {
        CarAbstraction car = new CarAbstraction();
        car.accelerate();
        car.brake();
    }
}
