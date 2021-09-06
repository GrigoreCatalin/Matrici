import java.util.Arrays;
import java.util.ArrayList;

public class Bonus {


    public static void main(String[] args) {
        int n = 30;
        boolean[] numbers = new boolean[n + 1];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (numbers[i] == true) {
                for (int j = i * i; j <= n; j = j + i) {
                    numbers[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (numbers[i] == true)
                System.out.print(i + " ");
        }

    }
}