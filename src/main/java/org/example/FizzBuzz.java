package org.example;
// by: Rahmma
// Date:05/23/2023
public class FizzBuzz {
    public static void main(String[] args) {

        int num = 100;

        for (int i = 1; i <= num; i++) {

            if (((i % 5) == 0) && ((i % 7) == 0))
            {
                System.out.println("fizzbuzz");
            } else if ((i % 5) == 0)
            {
                System.out.println("fizz");
            } else if ((i % 7) == 0)
            {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
        
    }
}
// commit and push
