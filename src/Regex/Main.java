package Regex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyRegex regex = new MyRegex();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String ipStr = sc.nextLine();
            System.out.println(regex.isValidIPAddress(ipStr));
        }

    }
}
