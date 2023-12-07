package org.example;
import java.util.regex.*;
import java.util.Stack;

public class StringProcessor {
    public boolean isStringPassword(String password) {
        String spSymbol = "!@#$%^&*()-=_+[]{}|;:'\",.<>?/";

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean specialSymbol = false;

        for (int i = 0; i < password.length(); i++){
            char currentChar = password.charAt(i);

            if (Character.isUpperCase(currentChar)){
                upper = true;
            } else if (Character.isLowerCase(currentChar)){
                lower = true;
            } else if (Character.isDigit(currentChar)){
                digit = true;
            } else if (spSymbol.contains(Character.toString(currentChar))) {
                specialSymbol = true;
            }

            if (upper && lower && digit && specialSymbol){
                return true;
            }
        }

        return false;
    }

    public int calculateDigits(String sentence){
        boolean digit = false;
        int digitCounter = 0;

        for (int i = 0; i < sentence.length(); i++){
            char currentChar = sentence.charAt(i);
            if (Character.isDigit(currentChar)){
                digitCounter++;
            }
        }
        return digitCounter;
    }

    public int calculateWords(String sentence){
        String[] words = sentence.split(" ");
        int wordCounter = 0;

        for (String word : words) {
            wordCounter++;
        }
        return wordCounter;
    }

    public double calculateExpression(String expression){
        return 0;
    }

}
