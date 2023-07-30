package org.example;

public class SortArrays1 {


    public static void main(String[] args) {
        int temp;
        int[] arrNumbers = {14, 8, 5, 54, 41, 10, 1, 500};
        System.out.println("Before sort: ");
        for (int num : arrNumbers) {
            System.out.print(num+ " ");
        }

     //  for (int num : arr) {
       //   System.out.print(num + " ");

        for (int a = 0; a < arrNumbers.length; a++) {
            for (int b = a + 1; b < arrNumbers.length; b++) {
                if (arrNumbers[a] > arrNumbers[b]) {
                    temp = arrNumbers[a];
                    arrNumbers[a] = arrNumbers[b];
                    arrNumbers[b] = temp;
                }
            }
        }
        System.out.println("After sort: ");
        for (int num : arrNumbers) {
            System.out.print(num+ " ");
        }
    }
}

