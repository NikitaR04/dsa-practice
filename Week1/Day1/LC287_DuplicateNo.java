package Day1;
/**287. Find the Duplicate Number
Solved
Medium
Topics

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space. 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
 

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.

**/

import java.util.Scanner;
import java.util.HashSet;

public class LC287_DuplicateNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        
        //===== Approach 1: Brute force method O(n²) O(1) =====
        // int result = -1;
        // for(int i = 0; i < n-1; i++){
        //     for(int j = i+1; j < n; j++){
        //         if(nums[j] == nums[i]){
        
        //             result = nums[i];
        //             break;
        //         }
        //     }
        // }
        // System.out.println(result);

        //====Approach 2: HashSet O(n)O(n)=====
        int result = -1;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n ; i++){
            if(set.contains(nums[i])){
                result = nums[i];
                break;
            }
            set.add(nums[i]);
        }
        System.out.println(result);
        sc.close();
    }
}

