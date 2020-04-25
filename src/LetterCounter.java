import java.util.Scanner;

public class LetterCounter {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a phrase: ");
            String phrase = input.nextLine();
            int[] letterCountCap = new int[26];
            int[] letterCountLow = new int[26];

                char[] letters = phrase.toCharArray();
                for (int counter = 0; counter < letters.length; counter++) {
                    char letter = letters[counter];
                    if ( (letter >= 'A') && (letter <= 'Z') ) {
                        letterCountCap[letter - 'A']++;
                    }
                    if ((letter >='a') && (letter <= 'z')){
                        letterCountLow[letter - 'a']++;
                    }
                }

            for (int i = 0; i < letters.length; i++) {
                if ((letters[i] >='a') && (letters[i] <= 'z')) {
                    System.out.print(letters[i] + "-" + letterCountLow[letters[i] - 'a'] + ", ");
                }
                if ((letters[i] >='A') && (letters[i] <= 'Z')) {
                    System.out.print(letters[i] + "-" + letterCountCap[letters[i] - 'A'] + ", ");
                }
            }
        }

}
