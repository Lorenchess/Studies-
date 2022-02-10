package LuckyNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long L = in.nextLong();
        long R = in.nextLong();
        int lucky = 0;
        for (long i = L; i < R; i++) {
            if (String.valueOf(i).contains("6") && String.valueOf(i).contains("8")) continue;
            if (String.valueOf(i).contains("6") || String.valueOf(i).contains("8")) lucky++;


        }
            System.out.println(lucky);
    }
}
