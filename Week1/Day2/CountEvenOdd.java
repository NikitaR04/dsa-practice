/**================================================================
  PROBLEM: Count Even and Odd Numbers
  Difficulty: Easy | Appears in: TCS Ninja
================================================================

DESCRIPTION:
  Given an array of N integers, count the number of even
  and odd numbers in the array.

----------------------------------------------------------------
EXAMPLES:
----------------------------------------------------------------

  Example 1:
    Input:
      N = 5
      arr = [1, 2, 3, 4, 5]

    Output:
      Even count: 2
      Odd count: 3

  Example 2:
    Input:
      N = 6
      arr = [10, 21, 32, 43, 54, 65]

    Output:
      Even count: 3
      Odd count: 3

----------------------------------------------------------------
CONSTRAINTS:
----------------------------------------------------------------

  1 <= N <= 10^5
  -10^9 <= arr[i] <= 10^9

----------------------------------------------------------------
NOTES:
  - 0 is considered even
  - Negative numbers follow the same even/odd rule
    e.g. -4 is even, -3 is odd
  - Use arr[i] % 2 == 0 for even check (handles negatives too)
================================================================
Whenever you don't need to revisit elements, skip the array entirely and process on the fly inside the loop.
Need array (must store):

Reversing
Sorting
Two pointer problems
Anything needing previous/future elements

Don't need array (process on the fly):

Counting (even/odd, positives/negatives)
Sum, min, max
Any single-pass problem where you never look back
*/

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i = 0; i < n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // int evenCount = 0, oddCount = 0;
        // for(int i = 0; i < n; i++){
        //     if(arr[i] % 2 == 0){
        //         evenCount++;
        //     } else{
        //         oddCount++;
        //     }
        // }

        int evenCount = 0, oddCount = 0;
        //===== Modulo % Approach ==========
       
        // for(int i = 0; i < n; i++){
        // int num = sc.nextInt();
        // if(num % 2 == 0) evenCount++;
        // else oddCount++;

        //======= Bitwise AND(&) Method ========
        /**The bitwise method is the best — it checks the last bit directly (even numbers always have last bit 0, 
         odd have last bit 1), so it's faster than % and works correctly for negatives without any extra step. */
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if((num & 1) == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("Even Count: " + evenCount + "\nOdd Count: " + oddCount);

        sc.close();
    }
}
