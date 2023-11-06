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

}


