package com.fizzbuzz;

import java.util.Scanner;

public class FizzBuzz1 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Input Number: ");
        int input = scan.nextInt();

        // if statement

        if (input % 5 == 0){
            if (input % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if (input % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(input);

        // this has nested if statement which is not usually easy to read

        
    }

}

/* THIS CODE WORKS BUT DOES NOT FOLLOW 'DRY' (DON'T REPEAT YOURSELF)
   in this case, input % 5 is being repeated twice

   if(input % 5 == 0 && input % 3 == 0)
            System.out.println("FizzBuzz");
        else if(input % 3 == 0)
            System.out.println("Buzz");
        else if(input % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(input);

   */