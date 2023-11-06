public class Tema5 {
    public static void main(String[] args) {


        int[] numere = Utils.createIntArrayFromKeyboard();
        int[] numere1 = Utils.createIntArrayFromKeyboard();

        //  Scanner scan = new Scanner(System.in);
        //System.out.println("Introduceti valoarea lui n:");
        //int n = scan.nextInt();


        // afiseazaPrimeleNumere(numere);
        // afiseazaLungimea(numere, n);

        int b = returneazaSumaElementelorPareSiImpare(numere, numere1);
        System.out.print("Suma elementelor celor 2 array-uri sunt: " + b);
    }
    //1) Creaza o functie care primeste un array de numere intregi si returneaza un array cu primele 2 numere.

    public static int[] afiseazaPrimeleNumere(int[] numere) {
        int[] ar = new int[2];
        for (int i = 0; i < 2; i++) {
            ar[i] = numere[i];
        }
        return numere;
    }
    //2) Creaza o functie care primeste un array de numere si un int "n".
    // Afiseaza primele "n" numere ale arrayului, daca "n" este mai mare decat lungimea arrayului afiseaza toate numerele.

    public static void afiseazaLungimea(int[] numere, int n) {

        if (numere.length < n) {
            for (int i = 0; i < numere.length; i++) {

                System.out.println("Afiseaza elementele array-ului: " + numere[i]);
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(numere[i]);
            }
        }
    }
    //3) Creaza o functie care primeste 2 arrayuri de int.
    // Returneaza suma elementelor pare din primul array adunata cu suma elementelor impare din al doilea array

   /* public static int returneazaSumaElementelorPareSiImpare(int[] numere, int[] numere1) {
        int sum = 0;
        for (int i = 0; i < numere.length; i++) {
            if ((numere[i] % 2 == 0) && (numere1[i] % 2 == 1)) {
                sum = numere[i] + numere1[i];
            }
        }
        return sum;
    }*/

    public static int returneazaSumaElementelorPareSiImpare(int[] numere, int[] numere1) {
        int sum1 = 0;
        int sum2 = 0;
        int sumf = 0;
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] % 2 == 0) {
                sum1 += numere[i];
            }
        }
        for (int i = 0; i < numere1.length; i++) {
            if (numere1[i] % 2 == 1) {
                sum2 += numere1[i];
            }
        }
        sumf = sum1 + sum2;
        return sumf;
    }
}
