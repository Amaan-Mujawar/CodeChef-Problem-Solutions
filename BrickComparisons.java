/*
Brick Comparisons

Chef has N bricks with him, numbered 1 to N, with the i-th one being of size A[i].

Process:
1. Chef first picks up the brick numbered 1.
2. Next, he looks at the other bricks in the order 2, 3, …, N, and if he finds this brick has a strictly larger 
   size than the brick in his hand, he drops his current brick and picks this up instead.

Your task is find the number of the brick which is finally with Chef at the end of the process.

For example, A = [2, 1, 4, 3]. The process happens as follows:
Step 1: Chef first picks up the brick numbered 1.
Step 2: Chef looks at brick numbered 2, but it does not have a larger size than his current brick (which is brick 1)
Step 3: Chef looks at brick numbered 3, and it has a larger size than his current brick. Hence, he drops the brick 
numbered 1 and picks up the brick numbered 3.
Step 4: Chef looks at brick numbered 4, but it does not have a larger size than his current brick (which is brick 3)

Hence, the final brick with Chef is the brick numbered 3.

Input Format:
- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of multiple lines of input.
  - The first line of each test case contains N - the number of bricks.
  - The second line contains N integers - A[1], A[2], …, A[N].

Output Format:
For each test case, output on a new line the number of the brick which is finally with Chef.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 100
1 ≤ A[i] ≤ 100

Sample Input:
3
4
2 1 4 3
2
9 9
3
2 5 100

Sample Output:
3
1
3

Explanation:
Test Case 1 : Described in problem statement.
Test Case 2 : Note that Chef will not drop his brick if both the bricks have the same size. Hence, here Chef 
picks up brick numbered 1, and does not change to brick 2.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt(); 
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int index = 0; 

            for (int i = 0; i < N; i++) {
                if (A[i] > A[index]) {
                    index = i; 
                }
            }

            System.out.println(index + 1);
        }
    }
}
