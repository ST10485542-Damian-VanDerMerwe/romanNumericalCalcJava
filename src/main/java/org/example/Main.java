package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] romanValues = {"I","IV","V","IX","X","XL","L","XC","C"};
        int[] arabicValues = {1,4,5,9,10,40,50,90,100};
        int userInp = Integer.parseInt(JOptionPane.showInputDialog("Enter a numerical value"));
        if(userInp < 1 || userInp > 3999) {
            System.out.println("Invalid value. Range is 1-3999");
        }
        String output= "";
        //say userinp = 15
        int maxRes = 0;
        int index = 0;
        while(userInp > 0) {
                if(arabicValues[index]==userInp){
                    maxRes = arabicValues[index];
                    output += romanValues[index];
                    userInp-=arabicValues[index];
                }else if(arabicValues[index]>userInp){

                    maxRes = arabicValues[index-1];
                    System.out.println(maxRes);
                    output += romanValues[index-1];
                    System.out.println(output);
                    userInp-=arabicValues[index-1];
                    System.out.println(userInp);
                    index=0;
                }else {
                    index++;
                }
        }
        System.out.println(output);
    }
}