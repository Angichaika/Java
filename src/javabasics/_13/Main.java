package javabasics._13;
public class Main{
    public static void main(String[] args) {
        int poundsToSell = 10000;
        int poundsForDay = 1000;
        int daysToSell = 0;

        while (poundsToSell > 0) {
            double poundExchange = 1 + (Math.random() * 0.2);
            daysToSell++;
            if (poundExchange > 1.15) {
                poundsToSell -= poundsForDay;
                System.out.println("Day number " + daysToSell + ":" + " Remaining pounds to sell : " + poundsToSell);
            }
        }
        System.out.println("It took " + daysToSell + " days to sell all the pounds");
    }
    }
