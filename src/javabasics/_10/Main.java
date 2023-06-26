package javabasics._10;

public class Main {
    public static void main(String[] args) {
        // Define an array of strings called carBrands
        String[] carBrands = {"Audi", "Ford", "Lamborghini", "BMW", "Mercedes"};

        // Print the number of items in the carBrands array
        System.out.println("Number of car Brands: " + carBrands.length);

        // Print the 3rd item of the carBrands array
        System.out.println("Third car brand: " + carBrands[2]);

        // Declare an empty array of integers called primeNumbers
        int[] primeNumbers = new int[6];

        // Insert the values of the first 6 prime numbers into the primeNumbers array
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        System.out.println("Prime numbers:");
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.println(primeNumbers[i]);
        }
    }
}
