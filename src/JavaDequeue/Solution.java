package JavaDequeue;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Total numbers");
        int N = in.nextInt();
        System.out.println("subarray");
        int M = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            System.out.println("Number");
            int input = in.nextInt();

            deque.add(input);
            set.add(input);

            if (deque.size() == M) {
                if (set.size() > max) max = set.size();
                int first = deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }
        }

        System.out.println(max);
    }
}

//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        Deque deque = new ArrayDeque<Integer>();
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int maxUnique = 0;
//        for (int i = 0; i < n; i++) {
//            int num = in.nextInt();
//            if(i == 0){
//                deque.add(num);
//                maxUnique++;
//            }else{
//                if(deque.size() == m){
//                    deque.removeFirst();
//                }
//                if(!deque.contains(num) && maxUnique<m){
//                    maxUnique++;
//                }
//                deque.addLast(num);
//            }
//        }
//        System.out.println(""+maxUnique);
//    }
////////////////////////////////////////////////////////////////////////////////////
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Total Integers");
//        int N = sc.nextInt();
//        System.out.println("SubArray size");
//        int M = sc.nextInt();
//
//
//        Deque<Integer> dequeNumbers = new ArrayDeque<>();
//
//        while(N > 0) {
//            System.out.println("number");
//            int number = sc.nextInt();
//            dequeNumbers.offerFirst(number);
//            N--;
//        }
//
//        List<Integer> arrayDequeCopy = new ArrayList<>(dequeNumbers);
//        List<Integer> subArray = null;
//
//        int maxCount = 0;
//        for (int i =0; i <= arrayDequeCopy.size()-M; i++) {
//            int counter = 0;
//            subArray = arrayDequeCopy.subList(i,i+M);
//            System.out.println(subArray);
//            for (int j = 0; j < subArray.size(); j++){
//                for (int h = j; h < subArray.size(); h++) {
//                    if (subArray.get(j) != subArray.get(h)) {
//                        counter++;
//                    } else {
//                        continue;
//                    }
//                    if (counter > maxCount)
//                        maxCount = counter;
//                }
//            }
//        }
//
//        System.out.println(maxCount);
//    }
















