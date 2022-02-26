package StaticInitialization;

import java.util.Scanner;

import static Map.Main.sc;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static boolean flag = true;
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static {
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
       if (flag) {
           int area = B * H;
           System.out.println(area);
       }
    }


}
