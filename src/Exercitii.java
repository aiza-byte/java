import java.util.ArrayList;
import java.util.List;

public class Exercitii {
    public static void main(String[] args){
       // int[] numere=Utils.createIntArrayFromKeyboard();


      //  System.out.println(afiseazaLista());
        //  itereazaLista(numere);
   adaugaElemente();


    }

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection
    public static List<String> afiseazaLista(){
        List<String> culori=new ArrayList<>();
        culori.add("Black");
        culori.add("white");
        culori.add("red");
        culori.add("yellow");
        culori.add("blue");


        return culori;
    }

//2. Write a Java program to iterate through all elements in a array list.
    public static void itereazaLista(int[] numere){
       for (int i=0;i< numere.length;i++){
           System.out.println(numere[i]);

        }
    }
    //Write a Java program to insert an element into the array list at the first position
    public static void adaugaElemente(){
        List<String> culori=new ArrayList<>();
        culori.add(0,"white");
        culori.add(1,"yellow");
        culori.add(2,"blue");
        System.out.println(culori);

    }
    //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
    public static void eliminaUnElement(){

    }
}
