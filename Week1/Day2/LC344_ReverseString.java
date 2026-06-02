
/** 344. Reverse String
Solved
Easy
Topics
premium lock icon
Companies
Hint
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character. */

import java.util.Scanner;
import java.util.Arrays;

public class LC344_ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char [] str = new char[n];

        for(int i = 0; i < n; i++){
            str[i] = sc.next().charAt(0);
        }

        //==== Approach 1 : Two pointer O(n), O(1)=====
        // int j = n-1;
        // for(int i = 0; i < n/2; i++){
        //     char temp = str[i];
        //     str[i] = str[j];
        //     str[j] = temp;
        //     j--;

        // }

        //=====Cleaner Approach=======
        int i = 0, j = n-1;
        while(i < j){
             char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(str));
        sc.close();
    }
}
