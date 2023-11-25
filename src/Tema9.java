import java.util.ArrayList;
import java.util.List;

public class Tema9 {
    public static void main(String[] args) {
        String[] sentences = {"Ana are mere si pere", "Ana are mere", "Ana are doua pisici si trei caini"};
        int minNoOfWords = Utils.randomInt();
        //int minWordCharacters = Utils.randomInt();
        // int c = numberOfPhrases(sentences, minNoOfWords);
        // System.out.println(c);
        System.out.println(returnList(sentences, minNoOfWords));
        // System.out.println(numbersOfCharacter(sentences, minWordCharacters));
    }
    //1) Creaza o functie care primeste un array de stringuri "sentences" (fiecare string din array reprezinta o fraza cu cuvintele despartiete prin spatii)
    // si un int "minNoOfWords".
    //   Returneaza numarul de fraze din array care au numarul de cuvinte mai mare sau egal cu "minNoOfWords"
    //    Exemplu: sentences = ["Ana are mere si pere", "Ana are mere", "Ana are doua pisici si trei caini"]
    //            minNoOfWords = 4 => 2
    //            minNoOfWords = 6 => 1

    public static int numberOfPhrases(String[] sentences, int minNoOfWords) {
        //avem nevoie de o variabila care sa returneze numarul de fraze
        int count = 0;
        for (int i = 0; i < sentences.length; i++) {
            String phrases = sentences[i];
            String[] words = phrases.split(" ");
            for (int j = 0; j < words.length; j++) {
                if (words.length >= minNoOfWords) {
                    count++;
                }
            }
        }
        return count;
    }

    //2) Creaza o functie care primeste un array de stringuri "sentences" (fiecare string din array reprezinta o fraza cu cuvintele despartiete prin spatii) si un int "minNoOfWords".
    //   Returneaza o lista care contine toate frazele care au numarul de cuvinte mai mare sau egal cu "minNoOfWords"
    //   Exemplu: sentences = ["Ana are mere si pere", "Ana are mere", "Ana are doua pisici si 3 caini"]
    //            minNoOfWords = 4 => returneaza ["Ana are mere si pere", "Ana are doua pisici si 3 caini"]
    //            minNoOfWords = 6 => returneaza ["Ana are doua pisici si 3 caini"]
    public static List<String> returnList(String[] sentences, int minNoOfWords) {
        List<String> lista = new ArrayList<>();
        String str = "";
        for (String phrases : sentences) {
            String[] words = phrases.split(" ");
            // int c = words.length;
            if (minNoOfWords <= words.length) {
                lista.add(phrases);
            }
        }
        return lista;
    }
    //  3) Creaza o functie care primeste un array de stringuri "sentences" (fiecare string din array reprezinta o fraza cu cuvintele despartiete prin spatii) si un int "minWordCharacters".
    // Returneaza o lista cu toate cuvintele din fraze care au numarul de caractere mai mare sau egal cu "minWordCharacters"
    // Exemplu: sentences = ["Ana are mere si pere", "Ana are mere", "Ana are doua pisici si trei caini"]
    // minWordCharacters = 4 => returneaza ["mere", "pere", "mere", "doua", "pisici", "trei", "caini"]
    //  minWordCharacters = 6 => returneaza ["pisici"]

    public static List<String> numbersOfCharacter(String[] sentences, int minWordCharacters) {
        List<String> returnedCharacters = new ArrayList<>();
        //int charactersNumber = 0;
        for (String phrases : sentences) {
            String[] sentencesplit = phrases.split(" ");
            for (String words : sentencesplit) {
                // charactersNumber = words.length();
                if (words.length() >= minWordCharacters) {
                    returnedCharacters.add(words);

                }
            }

        }
        return returnedCharacters;

    }
}
