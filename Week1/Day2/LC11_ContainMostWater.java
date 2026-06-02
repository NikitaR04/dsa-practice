/**11. Container With Most Water
Medium
Topics
premium lock icon
Companies
Hint
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104 */

import java.util.Scanner;

public class LC11_ContainMostWater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];

        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        
        //========Approach 1: Brute Force method O(n^2)=============
        // int max = Integer.MIN_VALUE;
        // int area = 0;
        // for(int i = 0; i < n-1; i++ ){
        //     for(int j = i+1; j < n; j++){
        //         if(height[j] >= height[i]){
        //             area = height[i] * (j - i);
        //         }
        //         else if(height[j] <= height[i]){
        //             area = height[j] * (j - i);
        //         }
        //         max = Math.max(max, area);
        //     }
        // }

        //=========Approach 2: Two Pointer O(n), O(1)=======
        int left = 0, right = n - 1;
        int area = 0;
        int max = Integer.MIN_VALUE;
        while(left < right){
            int width = right - left;
            area = Math.min(height[left], height[right]) * width;

            max = Math.max(max, area);
            if(height[left] < height[right]) left++;
            else right--;
        }

        System.out.println(max);
        
        sc.close();
    }
}
