package Day1;
/**
 209. Minimum Size Subarray Sum
Medium
Topics
premium lock icon
Companies
Given an array of positive integers nums and a positive integer target,
return the minimal length of a subarray whose sum is greater than or equal to target.
If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 

Constraints:

1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
 */

import java.util.Scanner;

public class LC209_MinSizeSubarraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i = 0; i < n; i++){
             nums[i] = sc.nextInt();
        }
        
        // Approach 1: Brute Force O(n²)
        // int minLen = Integer.MAX_VALUE;

        // for(int i = 0; i < n; i++){
        //     int sum = 0;
        //     for(int j = i; j < n; j++){
        //         sum += nums[j];
        //         if(sum >= target){
        //             minLen = Math.min(minLen, j - i + 1);
        //             break;
        //         }
        //     }
        // }
        // if(minLen == Integer.MAX_VALUE) System.out.println(0);
        // else System.out.println(minLen);

        // //=====Approach 2: Sliding Window O(n)=======
        int minLen = Integer.MAX_VALUE;
        int left = 0, right = 0, sum = 0;
        for(right = 0; right < n; right++){
            sum += nums[right];
            while(sum >= target){
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
            }
        }
        if(minLen == Integer.MAX_VALUE){
            System.out.println(0);
        } else{
            System.out.println(minLen);
        }
        sc.close();
    }
    
}
