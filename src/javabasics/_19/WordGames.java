package javabasics._19;
import java.util.Scanner;
//The author is Angelina.
//This is the main class called "WordGames"
//This class contains 2 methods.
//addHelloWord method that takes one parameter as input called word and returns the String Hello
//getFullName method that takes two parameters as input called name and surname and returns their concatenation
public class WordGames {

    Scanner input = new Scanner(System.in);

    void addHelloWord() {
        System.out.println("Input word: ");
        String word = input.nextLine();
        System.out.println("Hello " + word);
    }

    void getFullName() {
        System.out.println("Input name: ");
        String name = input.nextLine();
        System.out.println("\n Input surname: ");
        String surname = input.nextLine();
        System.out.println(name + " " + surname);
    }
}