package com.manny;

import java.util.Scanner;

public class Main {
    /*
In mathematics, the Fibonacci numbers, commonly denoted Fn form a sequence,
called the Fibonacci sequence, such that each number is the sum of the two
preceding ones, starting from 0 and 1.*/

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c;

        for(int i=0; i<10; i++){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }

        // Below is a second method taking in user input:

//            int k,a,b;
//            Scanner sc = new Scanner(System.in);
//            k=0;
//            a=1;
//            b=1;
//        System.out.println("Enter any number");
//            int n = sc.nextInt();
//        System.out.print("1 1 ");
//        while(k<=n){
//            k=a+b;
//            if(k>=n)
//                break;
//            System.out.print(k + " ");
//            a=b;
//            b=k;
//        }
    }
}
