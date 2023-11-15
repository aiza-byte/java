import java.util.ArrayList;
import java.util.List;

public class Exercitii {
    public static void main(String[] args) {
        // int[] numere=Utils.createIntArrayFromKeyboard();


        //  System.out.println(afiseazaLista());
        //  itereazaLista(numere);
        //adaugaElemente();
        // afiseazaSublista();
        // twoStrings();
        //indexString();
        // afiseazaInceputul();
        String s1 = "Voi face si acest exercitiu!";
        String s2 = "L-am facut si pe acesta!";
        int id = 0;
        // afiseazaIndexul(s1, s2);
        //returneazaStringul(s1, id);

        afiseazaLexicoGrafic(s1, s2);


    }

    //1. Write a Java program to create a new array list, add some colors (string) and print out the collection
    public static List<String> afiseazaLista() {
        List<String> culori = new ArrayList<>();
        culori.add("Black");
        culori.add("white");
        culori.add("red");
        culori.add("yellow");
        culori.add("blue");


        return culori;
    }

    //2. Write a Java program to iterate through all elements in a array list.
    public static void itereazaLista(int[] numere) {
        for (int i = 0; i < numere.length; i++) {
            System.out.println(numere[i]);

        }
    }

    //Write a Java program to insert an element into the array list at the first position
    public static void adaugaElemente() {
        List<String> culori = new ArrayList<>();
        culori.add(0, "white");
        culori.add(1, "yellow");
        culori.add(2, "blue");
        System.out.println(culori);

    }
    //Creați o sub-listă care să conțină doar primele N elemente din lista principală.
    //Afișați sub-lista rezultată.

    public static void afiseazaSublista() {
        List<Integer> listaOriginala = new ArrayList<>();
        listaOriginala.add(2);
        listaOriginala.add(3);
        listaOriginala.add(4);
        listaOriginala.add(9);
        listaOriginala.add(10);

        int indiceInceput = 1;
        int indiceSfarsit = 4;

        List<Integer> sublista = listaOriginala.subList(indiceInceput, indiceSfarsit);
        System.out.println("Sublista este: " + sublista);
    }

    //Write a program that reads two strings from the user and outputs if one word is the suffix (last part) of the other.
    public static void twoStrings() {
        String str1 = "Vanillapudding";
        String str2 = "pudding";
        if (str1.endsWith(str2)) {
            System.out.println("pudding is a suffix of Vanillepudding");
        }
    }

    //Write a program that prints the index and the character for a given word.
    public static void indexString() {
        String ind = "Hello";
        String cautat = "H";
        String caut = "e";
        String cau = "ll";
        String ca = "o";
        int indice = ind.indexOf(cautat);
        int indice1 = ind.indexOf(caut);
        int indice2 = ind.indexOf(cau);
        int indice3 = ind.indexOf(ca);
        System.out.println("Indicele este: " + indice);
        System.out.println("Indicele este: " + indice1);
        System.out.println("Indicele este: " + indice2);
        System.out.println("Indicele este: " + indice3);
    }

    //Write a program that takes two strings and prints where in the first string the second string starts
    public static void afiseazaInceputul() {
        String s1 = "Acesta este inceputul sfarsitului";
        String s2 = "este";

        int index = s1.indexOf(s2);
        System.out.println(index);

    }

    //Write a program that takes an int as position and two strings and prints where in the first string the second string starts
    public static void afiseazaIndexul(String s1, String s2) {
        int index = s1.indexOf(s2, 4);
        System.out.println(index);

    }

    //Write a program that reads a string and a number from the input and splits the given string at the index of the number.
    public static void returneazaStringul(String s1, int id) {
        String[] sp = s1.split("i", id);
        for (String part : sp) {
            System.out.print(" " + part + " ");

        }
    }

    //Write a program that reads two strings from the user and outputs them in lexicographical order.
    public static void afiseazaLexicoGrafic(String s1, String s2) {
        int result = s1.compareTo(s2);
        if (result < 0) {
            System.out.println(s1 + " is lexicographically before " + s2);
        } else if (result > 0) {
            System.out.println(s1 + " is lexicographically after " + s2);
        } else {
            System.out.println(s1 + " is lexicographically equal to " + s2);
        }

    }
}
