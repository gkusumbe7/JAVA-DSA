package test2;
// Three numbers A, B and C are the inputs. Write a program to find second largest among them.

import java.util.Scanner;

// Input Format

// For each test case, you will get

// A in the first line as an integer input,

// B in the second line as an integer input,

// C in the third line as an integer input.

// Constraints

// 1<=A,B,C<=1000000
// Output Format

// display the second largest among A, B and C, in a new line.

// Sample Input 0

// 120 11 400
// Sample Output 0

// 120

public class T2Q4 {
    public static void main(String args[]){
            Scanner scn = new Scanner(System.in);
         int a = scn.nextInt();
         int b = scn.nextInt();
         int c = scn.nextInt();
        
        if(a > b && a > c){
            if(b > c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }else if(b > a && b > c){
            if(a > c ){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if(a > b){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        }
    }
}
