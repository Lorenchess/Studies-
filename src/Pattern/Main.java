package Pattern;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    /**
     * Later pass the logic to a method and call it recursive
     **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number of test cases:");
        int numberOfTest = Integer.parseInt(sc.nextLine());

        while(numberOfTest > 0) {
            System.out.println("Type your regex:");
            String regex = sc.nextLine();
            try {
                Pattern pattern = Pattern.compile(regex);
                System.out.println("Valid");

            } catch (PatternSyntaxException p) {
                System.out.println("Invalid");
            }
            numberOfTest--;
        }

    }
//    public static void printValidOrNotPattern(String strRegex) {
//
//
//
//    }

}
