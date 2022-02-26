package NumberFormat;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("payment?");
        double payment = sc.nextDouble();
        sc.close();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat eu = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + eu.format(payment));
        NumberFormat in = NumberFormat.getCurrencyInstance(indiaLocale);
        System.out.println("India: " + in.format(payment));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + china.format(payment));
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + france.format(payment));

    }
}
