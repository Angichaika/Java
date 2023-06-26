package javabasics._14;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        int daysTillEndOfMonth = currentDate.lengthOfMonth() - currentDate.getDayOfMonth();

        int daysTillEndOfYear = currentDate.lengthOfYear() - currentDate.getDayOfYear();

        System.out.println("There are " + daysTillEndOfMonth + " days left till the end of the month");
        System.out.println("there are " + daysTillEndOfYear + " days left till the end of the year");

    }
}
