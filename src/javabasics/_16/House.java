package javabasics._16;

public class House {
    private String address;
    private int numberOfFloor;
    public House(String address, int numberOfFloor) {
        this.address = address;
        this.numberOfFloor = numberOfFloor;
        System.out.println("The address for this house is " + address
                + "and it has " + numberOfFloor + " floors ");

    }
}
