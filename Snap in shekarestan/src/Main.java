//https://quera.ir/problemset/contest/8938/%D8%B3%D8%A4%D8%A7%D9%84-%D8%A7%D8%B3%D9%86%D9%BE-%D8%AF%D8%B1-%D8%B4%DA%A9%D8%B1%D8%B3%D8%AA%D8%A7%D9%86
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte m = scanner.nextByte();
        short[][] matrix = new short[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = scanner.nextShort();
            }
        }
        byte[][] travel = new byte[m][2];
        for (int i = 0; i < m; i++){
            travel[i][0] = scanner.nextByte();
            travel[i][1] = scanner.nextByte();
        }
        int sum = 0;
        for (int i = 0; i < m; i++){
            sum += matrix[travel[i][0] - 1][travel[i][1] - 1];
        }
        System.out.println(sum);
    }

}
