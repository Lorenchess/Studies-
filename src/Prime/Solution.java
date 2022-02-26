package Prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        bufferedReader.close();
        boolean result;
        BigInteger number = new BigInteger(n);

        result = number.isProbablePrime(1);

        if (result) {
            System.out.println("prime");
        } else {
            System.out.println("no prime");
        }

    }
}
