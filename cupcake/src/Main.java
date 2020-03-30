import java.util.Arrays;
import java.util.Scanner;

//https://quera.ir/course/assignments/15048/problems/50610

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] cake = new int[n];

        for (int i = 0; i < n; i++) {
            cake[i] = scanner.nextInt();
        }
        if (k == 2) {
            System.out.println(Math.min(cake[0], cake[n - 1]));
            return;
        }

        Arrays.sort(cake);

        if (k == 1) {
            System.out.println(cake[n - 1]);
        } else {
            System.out.println(cake[0]);
        }

    }
}