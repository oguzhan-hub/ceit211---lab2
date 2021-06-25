
package com.company;
import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        //TASK #2 Create a Scanner object here (not used for alternate)

        //identifier declarations
        final int NUMBER = 2 ;		// number of scores
        final int SCORE1 = 100;		// first test score
        final int SCORE2 = 95;		// second test score
        final int BOILING_IN_F = 212;  // freezing temperature
        double fToC;						// temperature in celsius
        double average;				// arithmetic average
        String output;					// line of output to print out
        //TASK 2
        Scanner scanner = new Scanner(System.in);
        String f_name;
        String l_name;
        //TASK #4 declare variables used here
        String diameter = null;
        int radius;

        // Find an arithmetic average
        //-----------added paranteses--------
        average = (SCORE1 + SCORE2) / NUMBER;
        output = SCORE1 + " and " + SCORE2 + " have an average of "
                + average;
        System.out.println(output);

        // Convert Fahrenheit temperatures to Celsius
        fToC = (5 * (BOILING_IN_F - 32))/9;
        output = BOILING_IN_F + " in Fahrenheit is " + fToC
                + " in Celsius.";
        System.out.println(output);
        System.out.println();		// to leave a blank line

        // ADD LINES FOR TASK #2 HERE
        System.out.println("Enter your first name: ");
        f_name = scanner.nextLine();
        System.out.println("Enter your last name: ");
        l_name = scanner.nextLine();
        System.out.println("Wellcome "+f_name+" "+l_name);

        System.out.println();		// to leave a blank line

        // ADD LINES FOR TASK #3 HERE
        char firstInitial = f_name.charAt(0);
        System.out.println(firstInitial);
        f_name = f_name.toUpperCase();
        l_name = l_name.toUpperCase();
        System.out.println(f_name+" "+l_name + " and its lenght is: " +(f_name.length()+l_name.length()));

        System.out.println();		// to leave a blank line

        // ADD LINES FOR TASK #4 HERE
        System.out.println("Please enter the diameter of your sphere: ");
        if (scanner.hasNextInt()){
            diameter = scanner.nextLine();
        }else{
            System.out.println("it is not an integer!");
        }
        radius = Integer.parseInt(diameter);
        double volume = (4 * Math.PI * radius * radius* radius) / 3;
        System.out.println("Volume is: "+volume+" with a diameter of: "+ diameter);
    }
}
