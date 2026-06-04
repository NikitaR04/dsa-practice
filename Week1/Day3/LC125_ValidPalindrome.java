/**125. Valid Palindrome
Solved
Easy
Topics
premium lock icon
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters. */

import java.util.Scanner;

public class LC125_ValidPalindrome{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //===Approach 1: removing non-alphanumeric character in 2 ways
        
        // //Way 1 : Using replaceAll() with Regex

        // String changedStr = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        // // Shorthand Regex \W : a built-in shorthand for "any non-word character" (everything except letters, numbers, and underscores)
        // //String changedStr = s.replaceAll("[\\W]","").toLowerCase(); 
        // // \\W removes everything except A-Z, a-z, 0-9, and _
        // // [\\W_] additionally removes the underscore

        // int left = 0, right = changedStr.length() - 1;
        // boolean palindrome = true;
        // while(left < right){
        //     if(changedStr.charAt(left) != changedStr.charAt(right)){
        //         palindrome = false;
        //         break;
        //     }
        //     right--;
        //     left++;
        // }
        // System.out.println(palindrome);

        //====Way 2: StringBuilder O(n),O(n)===============

        // StringBuilder sb = new StringBuilder();
        // for(char c : s.toCharArray()){
        //     if(Character.isLetterOrDigit(c)){
        //         sb.append(Character.toLowerCase(c));
        //     }
        // }
        // System.out.println(sb);
        // int left = 0, right = sb.length() - 1;
        // boolean palindrome = true;
        // while(left < right){
        //     if(sb.charAt(left) != sb.charAt(right)){
        //         palindrome = false;
        //         break;
        //     }
        //     right--;
        //     left++;
        // }
        // System.out.println(palindrome);

        //===Approach 2: Two pointers directly on string w/o using extra space O(n), O(1)

        int left = 0, right = s.length() - 1;
        boolean palindrome = true;
        while(left < right){

            //skipping non-alphanumeric from left
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) 
                left++;

            //skipping non-alphanumeric from right
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) 
                right--;
            
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)) ){
                palindrome = false;
                break;
            }
            left++;
            right--;
           
        }
        System.out.println(palindrome);
    
        sc.close();
    }
}