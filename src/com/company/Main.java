package com.company;

import java.util.Scanner;

/*
 * Author: Hojjat Shabab
 *
 * Created on April 19, 2021, 09:21 AM
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner myScanner = new Scanner(System.in);
        System.out.println("*******************************welcome to the sequence of prime number progrm*************************************");
        System.out.print("please enter your number=");
        int num = myScanner.nextInt();
        sequencePrime(num);

    }

    public static void sequencePrime(int num) {
        if (num == 1) {
            System.out.println("The number is not a prime number And the number is not a compound number");
            return;
        } else if (num <= 0) {
            System.out.println("The number entered in the set of numbers is not natural");
            return;
        }
        for (int i = 2; i < num; i++) {
            int j;
            outter:
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    break outter;
            }
            if (j >= i)
                System.out.print(i + "\t");
        }
    }
}
