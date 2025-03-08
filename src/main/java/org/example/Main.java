package org.example;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        //Store 2 arrays, Roman Symbols as a String array, and arabic integer as an int array
        String[] romanValues = {"I","IV","V","IX","X","XL","L","XC","C"};
        int[] arabicValues = {1,4,5,9,10,40,50,90,100};
        //receive user input
        int userInp = 0;
        //ensure user input fits integer format
        try {
            userInp = Integer.parseInt(JOptionPane.showInputDialog("Enter a numerical value"));
        } catch (NumberFormatException e) {
            System.out.println("Error, Ensure input is integer in given range.");
        }
        //ensure range is valid
        if(userInp < 1 || userInp > 3999) {
            System.out.println("Invalid value. Range is 1-3999");
        }
        String output= "";
        //
        int index = 0;
        //run through arrays until received value reaches zero
        while(userInp > 0) {
                if(arabicValues[index]==userInp){
                    output += romanValues[index];
                    userInp-=arabicValues[index];
                }else if(arabicValues[index]>userInp){
                    //say we are using 15 as user input
                    //if the Arabic value is greater than user value (50), fall back one value (10), store the roman value (X) in output
                    output += romanValues[index-1];
                    //then subtract the arabic value of stored roman value from user input
                    //in this case, 15-(10) = 5
                    userInp-=arabicValues[index-1];
                    //run loop again until input = 0
                    index=0;
                }else {
                    index++;
                }
        }
        System.out.println(output);

    }
}