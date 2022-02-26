package FilterData;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //int[]data = {7,6,4,3,3,9,4,9,7,4,6};
        int[]data = {-7,6,4,3,3,9,4,9,7,4,6};
        filterDuplicate(data);
    }
    public static int[] filterDuplicate(int[]data) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < data.length; i++) {
            set.add(data[i]);
        }
        int[] intArr = set.stream().mapToInt(i -> i.intValue()).toArray();
        System.out.println(Arrays.toString(intArr));
        return intArr;
    }
}
