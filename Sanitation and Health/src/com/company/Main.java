package com.company;
//https://quera.ir/course/assignments/15048/problems/50608
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte x = scanner.nextByte();
        byte n = scanner.nextByte();

        if (n == 0){
            System.out.println(20);
        }else if (n == 7){
            System.out.println(x);
        }else {
            System.out.println(Math.max(x - n, 0));
        }

    }
}
