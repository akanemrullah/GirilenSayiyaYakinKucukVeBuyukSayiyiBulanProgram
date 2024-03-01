import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int number, min = 0, max = 0;
        boolean minCheck = false, maxCheck = false;
        Arrays.sort(list);

        System.out.print("Bir deger gir: ");
        number = input.nextInt();

        // Min degeri bul
        for (int i = 0; i < list.length; i++) {

            if (list[i] >= number) {
                if (i > 0) {
                    min = list[i - 1];
                    minCheck = true;
                    break;
                } else {
                    min = list[i];
                    minCheck = true;
                    break;
                }
            }
            if (!minCheck){
                min = list[list.length - 1];
            }
        }

        // Max degeri bul
        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] <= number) {
                if (i < list.length - 1) {
                    max = list[i + 1];
                    maxCheck = true;
                    break;
                } else {
                    max = list[i];
                    maxCheck = true;
                    break;
                }
            }
            if (!maxCheck){
                max = list[0];
            }
        }
        System.out.print("Minimum: " + min + "\nMaksimum: " + max);
    }
}