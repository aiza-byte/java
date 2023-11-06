public class Tema4 {
    public static void main(String[] args) {
        int[] numere = Utils.createIntArrayFromKeyboard();
        //  String[] str=Utils.createStringArrayFromKeyboard();
        //int[] numere1 = Utils.createIntArrayFromKeyboard();


        //  int x=pozitiiPare( numere);
        //System.out.println("Suma este: "+ x);

        // elementeArray(numere, numere1);

        // sumaArray(numere, numere1);

        // int y = returneazaElementeleImpare(numere);
        //  System.out.println(y);

        // int z=sumaUltimelorPatruNumere(numere);
        // System.out.println(z);

        // afiseazaNumereImpare(numere);

        //numereleCareSeImpart(numere);

        // int w= sumaElementelor(numere);
        //System.out.println(w);

        // sum(numere);

        //  int e=sumaNumerelorPare(numere);
        // System.out.println(e);

        // afisareaNumerelorPareImpare(numere);

        // int u=sumaPozitiilor(numere);
        //System.out.println(u);

        // System.out.println((float)5 / 2);

        // afisareDimensiune(numere);

        //  afiseazaPrimeleNumere(numere);


    }

    //1) Creaza o functie care primeste un array de numere si returneaza suma numerelor de pe pozitiile pare
    public static int pozitiiPare(int[] numere) {
        int sum = 0;
        for (int i = 0; i < numere.length; i++) {
            if (i % 2 == 0) {
                //  int i1 = numere[i];
                sum += numere[i];

            }
        }
        System.out.printf("Suma pozitiilor pare este:" + sum);
        return sum;
    }

    //2) Creaza o functie care primeste 2 arrayuri de numere si afiseaza numerele arrayului cu cele mai multe elemente.
    public static void elementeArray(int[] numere, int[] numere1) {
        if (numere.length > numere1.length) {
            for (int i = 0; i < numere.length; i++) {
                System.out.println("valorile sunt: " + numere[i]);

            }
        } else {
            // int y = numere1.length;
            for (int i = 0; i < numere1.length; i++) {
                System.out.println("valorile sunt: " + numere1[i]);
            }

        }

    }

    //3) Creaza o functie care primeste 2 arrayuri de numere si afiseaza suma elementelor din ambele arrayuri.
    //[1,1];[1,1]
    //sum=2;sum=3;
    //s-a afisat 3
    //sum=4;
    //s-a afisat 4
    public static void sumaArray(int[] numere, int[] numere1) {
        int sum = 0;
        for (int i = 0; i < numere.length; i++) {
            sum += numere[i];
        }
        for (int i = 0; i < numere1.length; i++) {
            sum += numere1[i];
        }
        System.out.println("Suma celor 2 array-uri este: " + sum);
    }


//[1,2,3,4,5,6,7]-prima data trebuie sa parcurgi fiecare element pentru a vedea care sunt impare.Pe urma trebuiesc afisate cate elemente sunt.
    //problema este ca imi afiseaza 2 array-uri cand eu am bagat in functie unul singur si nu imi afiseaza elementele impare.
    //am folosit countOdd pentru a numara elementele impare din array.


    //4) Creaza o functie care primeste un array de numere (int) si returneaza cate elemente impare are
    public static int returneazaElementeleImpare(int[] numere) {
        int countOdd = 0;
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] % 2 == 1) {
                countOdd += 1;
            }
        }
        return countOdd;
    }

    // 5) Creaza o functie care primeste un areay de numere si returneaza suma ultimelor 4 elemente, daca nu are 4 elemente returneaza 0. (editat)
    public static int sumaUltimelorPatruNumere(int[] numere) {
        int sum = 0;
        if (numere.length - 4 >= 0) {
            int startIndex = numere.length - 4;
            for (int i = startIndex; i < numere.length; i++) {
                sum = sum + numere[i];
            }
        }
        return sum;
    }

    //1) Creaza o functie care primeste un array de numere intregi si afiseaza numerele impare
    public static void afiseazaNumereImpare(int[] numere) {

        for (int i = 0; i < numere.length; i++) {
            if (numere[i] % 2 == 1) {
                System.out.println("Numerele impare sunt: " + numere[i]);
            }

        }

    }
    //2) Creaza o functie care primeste un array de numere intregi si afiseaza numerele care se impart exact la 3

    public static void numereleCareSeImpart(int[] numere) {
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] % 3 == 0) {
                System.out.println("Numerele care se impart exact la 3 sunt: " + numere[i]);
            }
        }
    }

    //  3) Creaza o functie care primeste un array de numere intregi si
    //  returneaza suma dintre primul si ultimul element
//--- Exemplu : Input -> {3,4,5,6,7} -> Output 10 (3+7)
    public static int sumaElementelor(int[] numere) {
        int sum = 0;
        for (int i = 0; i < numere.length; i++) {
            sum = numere[0] + numere[numere.length - 1];
        }
        System.out.println(sum);
        return sum;
    }

    //4) Creaza o functie care primeste un array de numere intregi si afiseaza suma tuturor elementelor.
    public static void sum(int[] numere) {
        int sum = 0;
        for (int i = 0; i < numere.length; i++) {
            sum += numere[i];
        }
        System.out.println("Suma este: " + sum);
    }

    //5) Creaza o functie care primeste un array de numere intregi si returneaza suma numerelor pare.
    public static int sumaNumerelorPare(int[] numere) {
        int sum = 0;
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] % 2 == 0) {
                sum += numere[i];
            }
        }
        System.out.println("Suma este: " + sum);
        return sum;
    }
    //6) Creaza o functie care primeste un array de numere intregi
    // si afiseaza pe rand numerele pare si apoi numere impare din array
    //--- Exemplu : Input -> {3,4,5,6,7} -> Afiseza in ordine 4 6 3 5 7

    //nu imi dau seama de ce nu imi afiseaza cum trebuie
    public static void afisareaNumerelorPareImpare(int[] numere) {
        int pare = 0, impare = 0;

        for (int i = 0; i < numere.length; i++) {

            if (numere[i] % 2 == 0) {
                // System.out.println(numere[i]);
                pare = numere[i];
            } else {
                impare = numere[i];
                // System.out.println(numere[i]);;
            }
            System.out.print("Elementele pare si impare sunt:" + pare + " " + impare);

        }
        //  System.out.print("Elementele pare si impare sunt: "+pare+" "+impare);
    }
    //creeaza o functie care primeste int[] si returneaza suma pozitiilor elementelor impare.
    //[1,2,3,4]
    //[0,1,2,3] verificam daca elementele sunt impare si pe urma afisam suma pozitiilor acestora.

    public static int sumaPozitiilor(int[] numere) {
        int sum = 0;
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }
    //creeaza o fct care primeste int[] si afiseaza prima jumatate a array-ului,in cazul in care array-ul are length impar se afiseaza cea mai mica jumatate
    // in cazul la 7 se afiseaza primele 3.

    public static void afisareDimensiune(int[] numere) {
        int endIndex = 0;
        //trebuie sa impartim length-ul la 2 pentru a afisa prima jumat.daca avem 2 if-uri identice atunci nu mai trebuie if-ul.
        endIndex = numere.length / 2;
        for (int i = 0; i < endIndex; i++) {
            System.out.println(numere[i]);
        }
    }

    //Creaza o functie care primeste un array de int uri si afiseaza toate numerele inafara de primul si ultimul
    //primul element numere[0]
    //ultimul element numere[numere.length-1]
    //[1,2,3,4,5]
    //[0,1,2,3,4]
    public static void afiseazaElementele(int[] numere) {
        for (int i = 1; i < numere.length - 1; i++) {
            System.out.println(numere[i]);

        }
    }


}



