package javabasics._15;

public class TestProgrammers {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer( "Angelina", 27, true);
        Programmer programmer2 = new Programmer( "Paolo" ,25, false);

        programmer1.drinkCoffe();
        programmer1.printDetails();

        programmer2.printDetails();
        programmer2.hasGlasses();
    }

}
