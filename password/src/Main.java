import java.util.Scanner;
//https://quera.ir/problemset/contest/17902/%D8%B3%D8%A4%D8%A7%D9%84-%D8%B1%D9%85%D8%B2
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String k = scanner.next();
        String pass = scanner.next();
        int kNumber = Integer.parseInt(k);
        String[] number = new String[kNumber];
        for (int i = 0; i < kNumber; i++){
            number[i] = scanner.next();
        }

        int sum = 0;
        int status;
        for (int i = 0 ; i < kNumber; i++){
            status =  number[i].indexOf(pass.charAt(i));
            if (status < 5){
                sum += status;
            }
            else
                sum += 9 - status;
        }
        System.out.println(sum);
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int k = scanner.nextInt();
//        int pass = scanner.nextInt();
//        byte[] passArray = new byte[k];
//        for (int i = 0; i < k ; i++) {
//            passArray[i] = (byte) (pass % 10);
//            pass = pass / 10;
//        }
//        int[] number = new int[3];
//        for (int i = 0; i < k; i++) {
//            number[i] = scanner.nextInt();
//        }
//        int[][] numberArray = new int[k][9];
//
//        for (int i = 0; i < k ; i++) {
//            for (int j = 0; j < 9; j++) {
//                numberArray[i][j] = (number[i] % 10);
//                number[i] = number[i] / 10;
//            }
//        }
//
//        int sum = 0;
//        for (int i = 0; i < k; i++) {
//            for (int j = 8; j >= 0; j--) {
//                if (passArray[i] == numberArray[i][j]){
//                    if (j > 3)
//                        sum += 8 - j;
//                    else
//                        sum += j + 1;
//                    break;
//                }
//            }
//        }
//        System.out.println(sum);
//    }
}
