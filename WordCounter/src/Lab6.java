/*
 *  Assignment Lab 6
 *  Description: This program counts the words that are entered in by a user in a sentence.
 *  Name: James Giatpaiboon
 *  ID: 917848716
 *  Class: CSC 211-03
 *  Semester: Fall 2019
 */

import java.util.Scanner;   //imported scanner for user input

public class Lab6 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in); // for users input
        Lab6 wordMethod = new Lab6();   // new object for method to be used

        String sentence;    // holds place for the sentence entered in by user

        System.out.println("Enter in a sentence:"); // prompts user to enter in a sentence
        sentence = input.nextLine();    // reads the sentence being entered

        wCount();   // prints thank you statement from first method

        // Prints out the users results: contains number of words in sentence
        System.out.println("There are " + (wordMethod.wCount(sentence) + 1) + " words in your input.");

    }

    public static void wCount() {   // first method for program
        System.out.println("Thank you for your input.");    // thanks user for their input

    }
    public int wCount(String str) { //second method for program
        int spaces = 0; //variable for number of spaces

        for (int i = 0; i < str.length() - 1; i++) {    // for loop to determine number of whitespaces
            if (str.charAt(i) == ' ') { // counts the spaces between the words (used to find number of words)
                spaces++;
            }
        }

        return spaces;  //returns number of spaces
    }


}