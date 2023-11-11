import java.util.ArrayList;
import java.util.List;

public class Tema7 {
    public static void main(String[] args) {
        int[] numere = Utils.createIntArrayFromKeyboard();
     //  System.out.println(returneazaMaximul(numere));

       // System.out.println( returneazaArrayCrescator(numere));

       // System.out.println( sumaElementelor(numere));

        System.out.println(sumaPrimelorDouaElemente(numere));

    }
    // 1) Creaza o functie care primeste un array de numere si returneaza cel mai mare numar din array.

    public static int returneazaMaximul(int[] numere) {
        int max=numere[0];
        for (int i=0;i< numere.length;i++){
            if(max<numere[i]){
                max=numere[i];
            }

        }
        return max;
    }
    // 2) Creaza o functie care primeste un array de numere si returneaza true daca arrayul este ordonat crescator. Altfel returneaza false.
    public static boolean returneazaArrayCrescator(int[] numere){
        boolean crescator=true;
        for(int i=0;i< numere.length;i++){
            if(numere[i]<numere[i+1]){
                crescator=true;
            }
            else {
                crescator=false;
            }
        }
        return crescator;
    }
    // 3) Creaza o functie care primeste un array de numere si returneaza o lista cu 2 elemente.
    // Primul element este suma elementelor pare din array iar al doilea element este suma elementelor impare.

    public static List<Integer> sumaElementelor(int[] numere){
        List<Integer> lista=new ArrayList<>() ;
        int sum1=0;
        int sum2=0;
        for(int i=0;i< numere.length;i++){
            if (numere[i]%2==0){
                sum1+=numere[i];

            }
            else {
                sum2+=numere[i];

            }
        }
        lista.add(sum1);
        lista.add(sum2);

        return lista;
    }
   // 4) Creaza o functie care priemste un array de numere.
    // Functia va aduna numerele din array 2 cate 2, si va adauga fiecare suma ca un element intr-o lista pe care o va returna.
    // Exemplu pentru arrayul [2,3,4,5,6,7] se va returna [5,9,13] (5 este suma la primele 2 numere, 9 este suma la urmatoarele de si tot asa).
  //  Daca arrayul are un numar impar de elemente ultima suma va fi egala cu ultimul element.
    //[1,2,3,4,5,6,7]
    //[3,7,11,7]
        public static List<Integer> sumaPrimelorDouaElemente(int[] numere){
        List<Integer> lista=new ArrayList<>();
        int sum=0;
        for(int i=0;i< numere.length-1;i+=2) {
            sum = numere[i] + numere[i + 1];
            lista.add(sum);
        }
            if (numere.length%2==1){
                lista.add(numere[numere.length-1]);
            }

        return lista;

    }
}
