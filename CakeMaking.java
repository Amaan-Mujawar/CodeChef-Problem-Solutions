/*
Cake Making

There are exactly 100 colours in the world, numbered 1 to 100.

Chef is making a 2-layered cake, and all that is left is deciding the colours of the 2 layers.

Chef has decided that we can choose any of the colours 1, 2, …, A for the first layer,
and any of the colours 1, 2, …, B for the second layer.

However, there is an extra constraint. To encourage diversity, the first and the second layer should not 
have the same colour.

How many different cakes are possible while following the above rules? 2 cakes are said to be different 
when either the first layer or the second layer has a different colour.

Input Format:
The first and only line of input contains 2 integers A and B.

Output Format:
Output the total number of possible cakes.

Constraints:
1 ≤ A, B ≤ 100

Sample 1:
Input:
2 3
Output:
4
Explanation:
The following cakes are possible: (The first number represents the colour of layer 1 and the second 
number the colour of layer 2)
(1, 2)
(1, 3)
(2, 1)
(2, 3)

Sample 2:
Input:
1 1
Output:
0
Explanation:
There are no possible cakes because we must make sure layer 1 and layer 2 do not have the same colour.

Sample 3:
Input:
100 5
Output:
495
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int totalCakes = A * B - Math.min(A, B);
        System.out.println(totalCakes);
    }
}
