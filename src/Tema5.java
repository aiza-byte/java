import java.util.ArrayList;
import java.util.List;

public class Tema5 {
    public static void main(String[] args) {


        //int[] numere = Utils.createIntArrayFromKeyboard();
        //int[] numere1 = Utils.createIntArrayFromKeyboard();

        //  Scanner scan = new Scanner(System.in);
        //System.out.println("Introduceti valoarea lui n:");
        //int n = scan.nextInt();


        // afiseazaPrimeleNumere(numere);
        // afiseazaLungimea(numere, n);

         //int b = returneazaSumaElementelorPareSiImpare(numere, numere1);
        //System.out.print("Suma elementelor celor 2 array-uri sunt: " + b);


        List<Integer> list=List.of(5,10,15,2,15,16);
     //   afiseazaUltimaCifra(list);

     //  List<Integer> c=returneaNumerePare(list);
      //  System.out.println(c);
        System.out.println( elementeArray(Utils.randomIntArray(5,0,100),Utils.randomIntArray(5,100,200)));

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
    //creaza o fct care primeste o lista de int si afiseaza ultima cifra a fiecarui element(daca se poate folosi for-each)
    public static void afiseazaUltimaCifra(List<Integer> list){
       // int item=0;
        for(int item:list){
           int x=item%10;
                System.out.println(x);

        }
    }

    //creaaza o fct care primeste o lista de integer si returneaza o lista cu toate numerele pare.
    public static List<Integer> returneaNumerePare(List<Integer> list){
        List<Integer> result=new ArrayList<>();
        for(int item:list){
            if(item%2==0){
                result.add(item);
            }
        }

        return result;
    }
    //creaza o fct care primeste 2 array-uri de int si returneaza o lista cu toate elementele acestora.
    //[5,2,3,4,5]=numere
    public static List<Integer> elementeArray(int[] numere,int[] numere1){
        List<Integer> result=new ArrayList<>();
        for(int item:numere){
            result.add(item);
        }
        for (int item:numere1){
            result.add(item);
        }
        return result;
    }
    // creeaza o functie care primeste un int[] si un int divizor.Functia returneaza o lista cu  toate numerele divizibile cu divizor.

    public static List<Integer> listaDivizor(int[] numere,int divizor){
        List<Integer> result=new ArrayList<>();
        for(int item:numere){
            if(item%divizor==0){
                result.add(item);
            }
        }
        return result;
    }

//creaza o fct care primeste o lista de integer si returneaza suma elementelor de pe pozitiile divizibile cu 3.
    public static Integer sumaPozitiilor(List<Integer> list){
        int sum=0;
        for(int i=0;i<list.size();i++){
            if(i%3==0){
                sum+=list.get(i);
            }
        }
        return sum;
    }
}
