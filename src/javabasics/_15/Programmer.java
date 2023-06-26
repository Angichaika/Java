package javabasics._15;

public class Programmer {
    private String name;
    private int age;
    private boolean wearGlasses;

    Programmer(String name, int age, boolean wearGlasses) {
        this.name = name;
        this.age = age;
        this.wearGlasses = wearGlasses;
    }
    void drinkCoffe() {
        System.out.println("Espresso is the secret!");
    }

    void printDetails() {
        System.out.println(name + " is a " + age + " yo programmer");
    }

    void hasGlasses() {
        System.out.println(" is " + name + " wearing glasses? " + wearGlasses);
    }
}



