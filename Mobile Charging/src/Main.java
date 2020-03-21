import java.util.Scanner;
//https://quera.ir/problemset/contest/17244/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte k = scanner.nextByte();
        short sum = (short) ((k * (k + 1)) / 2);
        System.out.println(sum);
    }
}
