package String;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

       String text = "This is an example.";
       String word = "welcometojava";

        getSmallestAndLargest(word, 3);

       /** indexOf(): method returns the position of the first occurrence of specified character(s) in a string.
        *  Use the lastIndexOf method to return the position of the last occurrence of specified character(s) in a string.
        *  int indexOf(String str)
        *  int indexOf(String str, int fromIndex)
        *  int indexOf(int char)
        *  int indexOf(int char, int fromIndex)
        *  RETURNS: An int value, representing the index of the first occurrence of the character in the string, or -1 if it never occurs
        *---------------------------------------------
        *  chartAt(): The charAt() method returns the character at the specified index in a string.
        *
        *  The index of the first character is 0, the second character is 1, and so on.
        *  RETURNS: A CHAR value at the specified index of this string.
        *  String myStr = "Hello";
        *  char result = myStr.charAt(0);
        *  Throws: IndexOutOfBoundsException - if index is negative or not less than the length of the specified string
        * ----------------------------------------------
        *  substring(): The substring(int beginIndex, int endIndex) method of the String class.
        *  It returns a new STRING that is a substring of this string.
        *  The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
        *  Thus the length of the substring is endIndex-beginIndex.
        *
        *  // prints the substring after index 8 till index 17
        *  String substr = str.substring(8, 17);
        *
        * **/
      //possible solution 1
//        Scanner scan=new Scanner(System.in);
//        String str=scan.next();
//        int k=scan.nextInt();
//        SortedSet<String> sets=new TreeSet<>();
//        for(int i=0;i<=str.length()-k;i++){
//            sets.add(str.substring(i,i+k));
//        }
//        System.out.println(sets.first());
//        System.out.println(sets.last());

        //possible solution 2
//        String smallest = s.substring(0,k);
//        String largest  = "";
//        for(int i = 0; i < s.length()-k+1; i++){
//            if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
//            if(s.substring(i,i+k).compareTo(largest) >0) largest = s.substring(i,i+k);
//        }




    }
    public static void getSmallestAndLargest(String s, int k) {
//        SortedSet<String> set = new TreeSet<>();
//        for(int i = 0; i <= s.length()-k; i++){
//            set.add(s.substring(i, i+k));
//            System.out.println(set);
//        }
//        System.out.println(set.first());
//        System.out.println(set.last());

        String smallest = s.substring(0,k);
        String largest  = "";
        for(int i = 0; i < s.length()-k + 1; i++){
            if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
            if(s.substring(i,i+k).compareTo(largest) >0) largest = s.substring(i,i+k);
        }
        System.out.println(smallest + " " + largest);
    }
}














