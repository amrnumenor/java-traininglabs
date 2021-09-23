package com.example;

import global.skymind.training.intermediate.oop.demo.demo03_inheritance.Animal;

class AnimalsInheritance {
    // fields
    private int legs;
    private String name;

    // constructors
    public AnimalsInheritance(int legs, String name) {
        this.legs = legs;
        this.name = name;
    }
    public AnimalsInheritance(int legs) {
        this(legs, "animal");
    }

    public AnimalsInheritance(String name) {
        this(4, name);
    }

    public AnimalsInheritance() {
        this(4, "neko");
    }

    // methods
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class CatInheritance extends AnimalsInheritance {
    private String sound;
    private static final int legs = 4;

    public CatInheritance(String name, String sound) {
        super(legs, name);
        this.sound = sound;
    }

    public CatInheritance(String name) {
        this(name, "meow");
    }

    public CatInheritance() {
        super(legs, "neko");
    }

    @Override
    public void setLegs(int legs) {
        super.setLegs(legs);
    }

    public String getSound() {
        return sound;
    }
}

public class MyInheritance {
    public static void main(String[] args) {

        AnimalsInheritance animalA = new AnimalsInheritance(2, "bro");
        System.out.println(animalA.getLegs() + " " + animalA.getName());
        animalA.setLegs(3);
        animalA.setName("joe");
        System.out.println(animalA.getLegs() + " " + animalA.getName());

        CatInheritance catA = new CatInheritance();
        CatInheritance catB = new CatInheritance("bushido");
        CatInheritance catC = new CatInheritance("mushi", "meowmeow");
        System.out.println("Cat A - Name: " + catA.getName() + " Sound: " + catA.getSound() + " Legs: " + catA.getLegs());
        System.out.println("Cat B - Name: " + catB.getName() + " Sound: " + catB.getSound() + " Legs: " + catB.getLegs());
        System.out.println("Cat C - Name: " + catC.getName() + " Sound: " + catC.getSound() + " Legs: " + catC.getLegs());
    }
}
