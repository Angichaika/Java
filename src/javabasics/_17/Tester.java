package javabasics._17;
import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        House house = new House(); // Create a new House object

        System.out.println("Enter the number of floors: ");
        int floors = scanner.nextInt();
        house.setFloorsNumber(floors);

        scanner.nextLine();

        System.out.println("Enter the address: ");
        String address = scanner.nextLine();
        house.setAddress(address);

        System.out.println("Enter the names of residents (separated by commas): ");
        String residentsInput = scanner.nextLine();
        String[] residents = residentsInput.split(",");
        house.setResidentsNames(Arrays.toString(residents));

        scanner.close(); // Close the scanner

        // Print the details of the house using the getters
        System.out.println("House Details:");
        System.out.println("Floors: " + house.getFloorsNumber());
        System.out.println("Address: " + house.getAddress());
        System.out.println("Residents: ");
        for (String resident : house.getResidentsName()) {
            System.out.println("- " + resident);
        }
    }
}
