package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(checkIfBalanced(""));
        System.out.println(checkIfBalanced("[]"));
        System.out.println(checkIfBalanced("[][]"));
        System.out.println(checkIfBalanced("[][][[][]]"));
        System.out.println(checkIfBalanced("]["));
        System.out.println(checkIfBalanced("]][]["));
        System.out.println(checkIfBalanced("[]][[]"));
        System.out.println(generateStringWithRandomBrackets());
    }


    public static String generateStringWithRandomBrackets() {
        Random r = new Random();
        String myString = "";
        for (int i = 0; i < r.nextInt(20); i++) {
            if (r.nextInt(100) % 2 == 0) {
                myString += "[";
            } else {
                myString += "]";
            }

        }
        return myString;
    }

    public static boolean checkIfBalanced(String s) {
        int controlNumber = 0;
        for (char s1 : s.toCharArray()) {
            if (s1 == '[')
                controlNumber++;
            else
                controlNumber--;

            if (controlNumber < 0)
                return false;
        }
        return true;
    }
}
