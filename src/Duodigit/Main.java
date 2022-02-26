package Duodigit;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(isDuoDigit(102));
        System.out.println(isDuoDigit(12121));
        System.out.println(isDuoDigit(-121));
    }
    public static String isDuoDigit(int number) {
        int posNumber = Math.abs(number);

        Set<Character> set = new HashSet<>();
        String numStr = Integer.toString(posNumber);

        for (char arr : numStr.toCharArray()) {
            set.add(arr);
        }

        if (set.size() > 2) {
            return "n";
        }
        return "y";
    }
}
