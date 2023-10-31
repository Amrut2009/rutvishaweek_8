package java_week_8;

import java.util.Scanner;

public class Programme_3_FindVowelOrConsonant {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please provide single character from the alphabet:");
        String letter = scan.next();
        if (scan.hasNextInt()) {
            letter = letter.toLowerCase();
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("0") || letter.equals("u")) {
                System.out.println("Vowel");

            } else if (letter.length() > 1) {
                System.out.println("error");
            } else {
                System.out.println("Consonant");
            }
        } else{
            System.out.println("error");
        }

            }





    }

