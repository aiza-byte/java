import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String[] string = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        int[] numere = Utils.createIntArrayFromKeyboard();
        //float[] numbers=Utils.createFloatArrayFromKeyboard();
        // afiseazaElementele(string);
        ultimaCifra1(numere);
    }

    public static void afiseazaElementele(String[] string) {
        for (int i = 0; i < string.length; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                String elemente = string[i];
                System.out.println("Elementele sunt: " + elemente);
            }

        }
    }

    //2) Creaza o functie care primeste un array de intregi si afiseaza doar numerele care au ultima cifra divizibila cu 4.
    // --- Exemplu: pentru arrayul [5, 4, 14, 58] -> se va afisa 4, 14, 58
    public static void ultimaCifra1(int[] numere) {
        int rezultatul = 0;

        for (int i = 0; i < numere.length; i++) {
            int ultimaCifra = numere[i] % 10;
            if (ultimaCifra % 4 == 0) {
                System.out.println("Rezultatul este: " +numere[i] );
            }
        }
    }
    //3) Creaza o functie care primeste un array de float si afiseaza media aritmetica a elementelor.
    //   --- Exemplu: pentru arrayul [1 2 3 4 5] media aritmetica este (1+2+3+4+5)/5 = 3

    public static void sumaAritmetica(float[] numbers) {
        float sum=0;
        for(int i=0;i<numbers.length;i++) {
            sum+=numbers[i];
        }

        float ar = sum / numbers.length;
        System.out.println("Media aritmetica este: "+ar);

    }
}