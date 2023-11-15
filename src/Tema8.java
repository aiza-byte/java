import java.util.ArrayList;
import java.util.List;

public class Tema8 {
    public static void main(String[] args) {


        // String fraza = "Azi voi merge la magazin";
        //char despartitor = 'i';
        //spargeFraza(fraza, despartitor);

        //String str = "Maine voi face curatenie si voi face si prajituri";
        // String search = "face";
        // System.out.println(returneazaAparitia(str, search));

        String[] array = {"Azi", "voi", "rezolva", "si", "acest", "exercitiu!"};
        System.out.println(returneazaString(array));


        //   String propozitie = "Astazi nu vreau sa fac nimic si nu voi face absolut nimic legat de acest lucru";
        //  String[] negativism = {"nu", "absolut", "nimic"};


    }

    //1) Creaza o functie care primeste un string "fraza" si un caracter "despartitor".
    //Functia v-a sparge fraza in mai multe stringuri pentru fiecare aparitie a caracterului "despartitor".
    //Exemplu: fraza = "Azi voi merge la magazin!"; despartitor = 'i';
    //         returneaza ["Az"," vo", " merge la magaz", "n"]
    //Tip: O sa trebuiasca sa convertesti din char in string cauta pe net cum sa faci asta.
    public static void spargeFraza(String fraza, char despartitor) {
        List<String> list = new ArrayList<>();
        String mystring = Character.toString(despartitor);
        String[] lista = fraza.split(mystring);
        for (int i = 0; i < lista.length; i++) {
            System.out.print(" " + lista[i] + " ");
        }

    }
    //2) Creaza o functie care primeste un string care reprezinta o fraza(fiecare cuvat e despartit prin spatii) si inca un string care reprezinta un cuvant de cautare.
    //   Functia v-a returna de cate ori apare cuvantul in fraza.
    //   Exemplu: fraza = "Maine voi face curatenie si voi face si prajituri"; cuvant de cautare= "voi"
    //   Returneaza: 2
    //   Bonus: Cand se compara cuvintele nu trebuie sa tina cont daca unul e cu litera mare si altul cu litera mica.
    //          Exemplu: "Maine" si "maine" sunt acelasi cuvant chiar daca unul e cu "M" si altul cu "m".

    //	indexOf(String str)
    //Returns the index within this string of the first occurrence of the specified substring.
    //1)-1 means an item is not in the string


    public static int returneazaAparitia(String str, String search) {
        int count = 0;
        String[] despartim = str.split(" ");
        for (String item : despartim) {
            if (item.equals(search)) {
                count++;
            }
        }
        return count;
    }
    //3) Creaza o functie care primeste un array de string care reprezinta niste cuvinte. Functia v-a returna un string format din toate cuvintele cu spatiu intre ele.
    //   Exemplu: array=["Maine","merg","la","magazin"]
    //   Returneaza: Maine merg la magazin

    public static String returneazaString(String[] array) {
        String rezultat = "";
        for (String item : array) {
            rezultat = rezultat.concat(item + " ");
        }
        return rezultat;
    }

    //4) Creaza o functie care primeste un string care reprezinta o fraza (fiecare cuvant e despartit prin spatii) si inca un string care va reprezenta un cuvant interzis.
    //   Functia v-a sterge toate cuvintele interzise din fraza si returnaza rezultatul
    //   Exemplu: fraza = "Ana are mere" cuvantDeSters= "mere"
    //   Returneaza: "Ana are"
    //   Bonus: In loc sa primeasca doar 1 cuvant interzis fa functia sa primeasca un array de cuvinte interzise si sa le scoata pe toate din fraza.

}



