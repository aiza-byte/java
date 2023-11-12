package Examples;

import java.util.ArrayList;
import java.util.List;

public class ForAndForeach {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);

        List<Integer> listExample = new ArrayList<>();
        listExample.add(21);
        listExample.add(22);
        listExample.remove(1);

        int[] arr = new int[]{1, 2, 3, 4, 5};

        for (int item : list) {
            if (item % 2 == 1)
                System.out.println(item);
        }

        for (int item : arr) {
            if (item % 2 == 1)
                System.out.println(item);
        }

        for (int i = 0; i < list.size(); i++) {
            int item = list.get(i);

            if (item % i == 1)
                System.out.println(item);
        }

        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];

            if (item % 2 == 1)
                System.out.println(item);
        }
    }

    //[1,2,3,4,5,6]
    //divizor = 2
    public static int[] returnVaraibleSizeArray(int[] arr, int divizor) {
        int divisibleNumbersCount = 0;

        //aflam cate numere sunt divizibile cu divizorul
        for (int item : arr) {
            if (item % divizor == 0)
                divisibleNumbersCount++;
        }

        //cream resultatul cu lenghtul numerelor divizibile cu divizorul
        int[] result = new int[divisibleNumbersCount];

        int resultIndex = 0;

        //adaugam numerele divizibile cu divizorul in result. ne folosim de resultIndex ca sa stim pe ce pozitie punem elemetele
        for (int item : arr) {
            if (item % divizor == 0) {
                result[resultIndex] = item;
                resultIndex++;
            }
        }

        return result;
    }

}
