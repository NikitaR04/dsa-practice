
/**
 Second Largest Element in Array
Problem:
Given an array of n integers, find the second largest distinct element. If no second largest exists, return -1.
Example 1:
Input:
5
3 1 4 1 5
Output: 4
Example 2:
Input:
5
10 10 10 10 10
Output: -1
Example 3:
Input:
1
5
Output: -1
Example 4:
Input:
4
7 7 3 3
Output: 3
Example 5:
Input:
3
1 2 3
Output: 2

Constraints:

// 1 <= n <= 100000
// -1000000 <= nums[i] <= 1000000(array can have negative numbers)
Elements may have duplicates
Second largest must be distinct from the largest
 */

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        //====Approach 1 =======
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] > largest){
                secLargest = largest;
                largest = nums[i];
                
            }
            else if(nums[i] < largest && nums[i] > secLargest){
                secLargest = nums[i];
            }
        }
        if(secLargest == Integer.MIN_VALUE) System.out.println(-1);
        else System.out.println(secLargest);

        sc.close();
    }
}
