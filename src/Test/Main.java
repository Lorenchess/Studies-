package Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[]data = {7,6,4,3,3,9,4,9,7,4,6};


        //Exercise 1

        System.out.println(solve(150, 30, 20, 15)); //SPECIAL
        System.out.println(solve(80, 50, 100, 25)); //SPECIAL
        System.out.println(solve(110, 80, 90, 15)); //STANDARD
        System.out.println(solve(150, 80, 90, 30)); //REJECTED

        //Exercise 2
        filterDuplicates(data); //[7, 6, 4, 3, 9]


    }


    public static int[] filterDuplicates(int[] data){
        Set<Integer> set = new LinkedHashSet<>(); //Set do not allow duplicates
        for (int i = 0; i< data.length; i++) {
            set.add(data[i]); //add elements into Set
        }
        int[]intArray = set.stream()
                           .mapToInt(Integer::intValue)
                           .toArray(); //convert Set into int[];
        System.out.println(Arrays.toString(intArray)); //to see the elements we need to use Arrays.toString(arr)

        return intArray;
    }

    public static String solve(int width, int height, int length, int mass) {
        boolean bulky = false;
        boolean heavy = false;

        int maxVolume = 1000000;

        if (width * height * length >= maxVolume || width >= 150 || height >= 150 || length >= 150) {
            bulky = true;
        }
        if (mass >= 20) {
            heavy = true;
        }

        return (!bulky && !heavy ? "STANDARD" : bulky && heavy ? "REJECTED" : "SPECIAL");
    }

}


























