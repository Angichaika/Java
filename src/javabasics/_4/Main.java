package javabasics._4;

public class Main {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;
        int b = a;
        b++;
        //System.out.println(a);
        //System.out.println(b);

        if (b % 2 == 0) {
            System.out.println("the number is even");
        }else {
            System.out.println("the number is odd");
        }
        if(b * (b+1) % 3 == 0) {
            System.out.println("The number is multiple of 3");
        }else{
            System.out.println("The number is not multiple of 3");}
    }





    }

