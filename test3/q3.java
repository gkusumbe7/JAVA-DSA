package test3;

import java.util.Scanner;

public class q3 {
   public static void main(String args[]){

//          Write a program to take two numbers as input and print their difference if the first number is greater than the second number otherwise print their sum.

// Input Format

// First line contains a.

// Second line contains b.

// Constraints

// -1000 <= a,b <= 1000
// Output Format

// Print sum or difference

// Sample Input 0

// 82 
// 28
// Sample Output 0

// 54
// Explanation 0

// 82>28, so printed their difference (82-28) = 54
Scanner scn = new Scanner(System.in);
         int a = scn.nextInt();
         int b = scn.nextInt();
        if(a > b){
            System.out.println(a-b);
        }else{
            System.out.println(a+b);
        }
   }
}
