import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOne {
    public static void run() {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Input one line of words (S) : ");
        String word = scanner.nextLine();
        word = word.replaceAll(" ", "").toLowerCase();
        int wordLength = word.length();

        String vowelCharacter = "aeiou";
        List<Character> vowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();

        for (int i = 0; i < wordLength; i++) {
            char currentChar = word.charAt(i);
            if (vowelCharacter.indexOf(currentChar) != -1) {
                if (vowels.contains(currentChar)) {
                    int indexSameVowel = vowels.indexOf(currentChar);
                    vowels.add(indexSameVowel, currentChar);
                }else {
                    vowels.add(currentChar);
                }
            } else {
                if (consonants.contains(currentChar)) {
                    int indexSameConsonant = consonants.indexOf(currentChar);
                    consonants.add(indexSameConsonant,currentChar);
                } else {
                    consonants.add(currentChar);
                }
            }
        }

        StringBuilder vowelsStr = new StringBuilder();
        for (char c : vowels) {
            vowelsStr.append(c);
        }

        StringBuilder consonantsStr = new StringBuilder();
        for (char c : consonants) {
            consonantsStr.append(c);
        }

        // Output hasil
        System.out.println("Vowel Characters: ");
        System.out.println(vowelsStr.toString());
        System.out.println("Consonant Characters: ");
        System.out.println(consonantsStr.toString());

    }
}
