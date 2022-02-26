package TokensRE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //String str = "He is a very very good boy, isn't he?";
        //String str = "          YES      leading spaces        are valid,    problemsetters are         evillllll";
        String str = "             a                 ";

        printTokensInString(str);
    }
//    public static int numberOfTokensInString(String s) {
//
//    }
    public static void printTokensInString(String s) {
        String trimStr = s.trim();
        String [] arr = trimStr.split("[, '  ' ' ?]+");
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ""){
                break;
            } else {
                counter++;
            }
        }
        System.out.println(counter);
        for (String res : arr) System.out.println(res);
    }
}
