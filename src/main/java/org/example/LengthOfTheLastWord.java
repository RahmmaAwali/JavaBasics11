package org.example;



public class LengthOfTheLastWord {
    public int lengthOfLastWord(final String a)
    {
        int len = 0;

        String x = a.trim();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }

        return len;
    }

    // Driver code
    public static void main(String[] args)
    {
        LengthOfTheLastWord TT = new LengthOfTheLastWord();
        String input = "Hello World  ";
        String[] inputArray = input.split("\\s");

        System.out.println("input :" +input);
        System.out.println("output :" + TT.lengthOfLastWord(input));
        System.out.println("The last word is '" + inputArray[inputArray.length-1] +"' with length " +
                 TT.lengthOfLastWord(input));
    }
}
