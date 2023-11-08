import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    public static int[] createIntArrayFromKeyboard() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea array-ului:");
        int size = scan.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Se citeste elementul de pe pozitia :" + i);
            int nr = scan.nextInt();
            numbers[i] = nr;
        }

        return numbers;
    }

    public static String[] createStringArrayFromKeyboard() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea array-ului:");
        int size = scan.nextInt();
        String[] strings = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Se citeste elementul de pe pozitia :" + i);
            String str = scan.next();
            strings[i] = str;
        }

        return strings;
    }

    public static float[] createFloatArrayFromKeyboard() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea array-ului: ");
        int size = scan.nextInt();
        float[] number = new float[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Se citeste elementul de pe pozitia: " + i);
            float str = scan.nextFloat();
            number[i] = str;

        }
        return number;
    }
    public static int[] randomIntArray(int count, int min, int max) {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }

        return result;
    }


    public static List<Integer> randomIntList(int count, int min, int max) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add((int) Math.floor(Math.random() * (max - min + 1) + min));
        }

        return result;
    }

}


