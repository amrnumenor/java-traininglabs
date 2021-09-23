package com.example.ferry;

import com.example.car.Perodua;

public class Ferry {
    public Ferry() {
        System.out.println("Ferry has initialized");
    }
}

class Testing {
    public static void main(String[] args) {
        Perodua car = new Perodua();
        System.out.println("Number of windows: " + car.numberOfWindows);
    }
}