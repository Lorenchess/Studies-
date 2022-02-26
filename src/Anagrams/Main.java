package Anagrams;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

//    static boolean isAnagram(String a, String b) {
//
//         // test for invalid input
//        if( a == null || b == null || a.equals("") || b.equals("") )
//            throw new IllegalArgumentException();
//
//        // initial quick test for non-anagrams
//        if ( a.length() != b.length() )
//            return false;
//
//        a = a.toLowerCase();
//        b = b.toLowerCase();
//
//        // populate a map with letters and frequencies of String b
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (int k = 0; k < b.length(); k++){
//            char letter = b.charAt(k);
//
//            if( ! map.containsKey(letter)){
//                map.put( letter, 1 );
//            } else {
//                Integer frequency = map.get( letter );
//                map.put( letter, ++frequency );
//            }
//        }
//
//        // test each letter in String a against data in the map
//        // return if letter is absent in the map or its  frequency is 0
//        // otherwise decrease the frequency by 1
//
//        for (int k = 0; k < a.length(); k++){
//            char letter = a.charAt(k);
//
//            if( ! map.containsKey( letter ) ) {
//                System.out.println("No");
//                return false;
//            }
//
//
//            Integer frequency = map.get( letter );
//
//            if( frequency == 0 ) {
//                System.out.println("No");
//                return false;
//            }
//
//            else
//                map.put( letter, --frequency);
//        }
//        // if the code got that far it is an anagram
//        System.out.println("Yes");
//        return true;
//    }
//        static boolean isAnagram(String a, String b) {
//            if(a.length()!=b.length())return false;
//            int[]arr = new int[26];
//            String f = a.toLowerCase();
//            String s = b.toLowerCase();
//            for(int i =0;i<a.length();i++){
//                arr[f.charAt(i)-'a']++;
//                arr[s.charAt(i)-'a']++;
//            }
//            for(int i=0;i<arr.length;i++)if(arr[i]%2!=0) {
//                System.out.println("no");
//                return false;
//            }
//            System.out.println("yes");
//            return true;
//        }
    public static void main(String[] args) {
//        isAnagram("anagramm", "marganaa");
        isAnagram("abcde", "ayzwf");
        isAnagram("hello", "hello");
        isAnagram("cat", "atc");
////        System.out.println(isAnagram("anagram", "margana"));
        isAnagram("Abul", "BulA");
//
        //System.out.println(compareCharacters("abxd", "abxe"));

    }
    public static boolean isAnagram(String a, String b) {
        List<Character> listA = new ArrayList<>();
        List<Character> listB = new ArrayList<>();
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            listA.add(aLower.charAt(i));
            listB.add(bLower.charAt(i));
        }

        listA.retainAll(listB);

        if (listA.size() == (listB.size())) {
            System.out.println("Anagram");
            return true;
        } else {
            System.out.println("No Anagram");
            return false;
        }
    }


//    public static boolean isAnagram(String a, String b) {
//        int freqA = 0;
//        int freqB = 0;
//        int len = a.length();
//        if (a.length() == b.length()) {
//            for (int i = 0; i < len; i++) {
//                if (containsCharacter(b, a.charAt(i))){
//                    freqA = findFrequencyOfChar(a);
//                    freqB = findFrequencyOfChar(b);
//                }
//                else if (!compareCharacters(a, b)) {
//                    System.out.println("No Anagrams");
//                    return false;
//                }
//            }
//        } else {
//            System.out.println("No Anagrams");
//            return false;
//        }
//
//         if (freqA == freqB) {
//             System.out.println("Anagrams");
//             return true;
//         } else {
//             System.out.println("No Anagrams");
//             return false;
//         }
//    }
//
//    private static boolean containsCharacter(String str, char c) {
//          return str.contains(String.valueOf(c).toLowerCase());
//    }
//
//
//    private static int findFrequencyOfChar(String str) {
//        int freq = 0;
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j < str.length(); j++){
//                if (str.charAt(i) == str.charAt(j))
//                    freq++;
//            }
//        }
//        return freq;
//    }
//
//    private static boolean compareCharacters (String str1, String str2) {
//     if (str1.length() == str2.length()) {
//         for (int i = 0; i < str1.length(); i++) {
//             char b = str2.charAt(i);
//             if (str1.contains(String.valueOf(b))) return true;
//         }
//         return false;
//     }
//      return false;
//    }
}
























