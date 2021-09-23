package com.example;

class AnimalPoly {
    public void sound() {
        System.out.println("Animal Sound");
    }
}

class CatPoly extends AnimalPoly {
    public void sound() {
        System.out.println("The cat says: Meow");
    }
}

class FoxPoly extends AnimalPoly {
    public void sound() {
        System.out.println("What does the fox say ?");
    }
}

public class MyPolymorphism {
    public static void main(String[] args) {

        AnimalPoly a = new AnimalPoly();

        //the parent class reference variable is of the child class object
        AnimalPoly b = new CatPoly();
        AnimalPoly c = new FoxPoly();

        // CatPoly d = b;
        // AnimalPoly d = b;

        a.sound();
        b.sound();
        c.sound();
        // d.sound();
    }
}
