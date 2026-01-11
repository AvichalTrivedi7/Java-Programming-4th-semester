package Practice_For_All_Base_Concepts;

// Java program to read a character and check whether it is a vowel or consonant.

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String vowels = "aeiouAEIOU";
        boolean isVowel = false;

        for (int i = 0; i < vowels.length(); i++) {
            if (ch == vowels.charAt(i)) {
                isVowel = true;
                break;
            }
        }

        if (isVowel) {
            System.out.println("It is a Vowel");
        } else {
            System.out.println("It is a Consonant");
        }
        sc.close();
    }
}
