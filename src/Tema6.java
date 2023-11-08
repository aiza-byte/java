import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tema6 {
    public static void main(String[] args) {

        // int[] numere = Utils.createIntArrayFromKeyboard();
        String[] strg = Utils.createStringArrayFromKeyboard();

        List<String> str = List.of("aaa", "bbbb", "ccc", "dddd", "fff", "gggg", "hhhh");


        Scanner scan = new Scanner(System.in);


        //   System.out.println("Introduceti valoarea m: ");
        // int m= scan.nextInt();
        // afiseazaElementeleDivizibile(str,n,m);

        // System.out.println("Introduceti valoarea count: ");
        //  int count = scan.nextInt();
        // System.out.println("Introduceti valoarea n: ");
        //  int n = scan.nextInt();
        //  System.out.println(returneazaElementele(count, n));

        //System.out.println("Introduceti valoarea min ");
        //int min = scan.nextInt();
        // System.out.println(returneazaLista(numere,min));

        System.out.println("Introduceti valoarea maxCharacters: ");
        int maxCharacters = scan.nextInt();

        System.out.println(returneazaStringurile(strg, maxCharacters));
    }

    //1) Creaza o functie care primeste o lista de stringuri, un int "n" si un int "m".
    // Afiseaza elementelr de pe pozitiile divizibile cu "n" si de pe pozitiile divizibile cu "m".
    public static void afiseazaElementeleDivizibile(List<String> str, int n, int m) {
        // String z=new String();
        //  String p=new String();
        List<String> divn = new ArrayList<>();
        List<String> divm = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            if (i % n == 0) {
                String z = str.get(i);
                divn.add(z);
            }
            if (i % m == 0) {
                String p = str.get(i);
                divm.add(p);
            }
        }
        System.out.println(divn);
        System.out.println(divm);
    }
    //2) Creaza o functie care care primeste un int "count" si un int "n".
    // Returneaza o lista cu numarul de elemente egal cu "count" si toate elementele egale cu "n"
    // daca count= lista.size()  si elementele-din-lista=n=3 vom avea o lista cu [3,3,3,3,3]
    //

    public static List<Integer> returneazaElementele(int count, int n) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lista.add(n);
        }
        return lista;
    }


    //3) Creaza o functie care primeste un array de int si un int "min" returneaza o lista cu toate numerele mai mari decat "min".
    public static List<Integer> returneazaLista(int[] numere, int min) {
        List<Integer> minimul = new ArrayList<>();
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] > min) {
                minimul.add(numere[i]);
            }
        }
        return minimul;
    }

    //4) Creaza o functie care primeste un array de string si un int "maxCharacters".
    // Returneaza o lista care cu stringurile care au numarul de caractere mai mic sau egal cu "maxCharacters"
    public static List<String> returneazaStringurile(String[] strg, int maxCharacters) {
        List<String> strl = new ArrayList<>();
        for (int i = 0; i < strg.length; i++) {
            if (strg[i].length() <= maxCharacters) {
                strl.add(strg[i]);
            }
        }
        return strl;
    }
}
