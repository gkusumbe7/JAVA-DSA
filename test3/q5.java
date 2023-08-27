package test3;

import java.util.Scanner;

public class q5 {
    public static void main(String args[]){
//         Write a program to find the factorial value of any number entered by the user.

// Input Format

// First line contains integer n.

// Constraints

// 1 <= n <= 100
// Output Format

// Prints factorial.

// Sample Input 0

// 5
// Sample Output 0

// 120
// Explanation 0

// 5*4*3*2*1 = 120

Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
            int fact = 1 ;
            for( int i = 1 ; i <= n ; i++){
                fact = i * fact ;
            }
        System.out.println(fact);

    }
}
