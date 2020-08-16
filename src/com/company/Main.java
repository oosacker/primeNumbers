package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of values to test? ");
        long count = 0;

        try {
            count = scan.nextInt();
        }
        catch(Exception e) {
            System.out.println("Bad input! " + e.toString());
            System.exit(-1);
        }

        long n = 0;
        while(n<count) {
            System.out.print("Enter value? ");

            long val = 0;
            try {
                val = scan.nextInt();
            }
            catch(Exception e) {
                System.out.println("Bad input! " + e.toString());
                System.exit(-1);
            }

            if(isPrime(val))
                System.out.println("Prime");
            else{
                System.out.println("Not prime");
            }
            n++;
        }
        System.out.println("~End of program~ ");
    }

    private static boolean isPrime(long input) {

        if(input == 1) {
            return false;
        }

        else if(input == 2) {
            return true;
        }

        else if(input%2 == 0) {
            return false;
        }

        else {
            // for(int i=1; i<=input; i+=2) {
            //     if(input % i == 0 && i != input && i != 1) {
            //         return false;
            //     }
            // }
            for(long i=1; i<=input/2; i+=2) {
                if(input % i == 0 && i != 1 ) {
                    return false;
                }
            }
            return true;
        }
    }
}
