package test2;

import java.util.Scanner;

public class T2Q3 {
//     There are 3 problems in a contest namely A,B,C respectively. Sonu bets Bob that problem C is the hardest while Bob says that problem B will be the hardest.

// You are given three integers S1, S2, S3 which denotes the number of successful submissions of the problems A,B,C respectively. It is guaranteed that each problem has a different number of submissions. Determine who wins the bet.

// If Sonu wins the bet (i.e. problem C is the hardest), then output Sonu.

// If Bob wins the bet (i.e. problem B is the hardest), then output Bob.

// If no one wins the bet (i.e. problem A is the hardest), then output Draw.

// Note: The hardest problem is the problem with the least number of successful submissions.

// Input Format

// The first and only line of each test case contains three space-separated integers S1, S2, S3 denoting the number of successful submissions of problems A,B,C respectively.

// Constraints

// 1<=S1,S2,S3<=100 S1, S2, S3 are all distinct.

// Output Format

// output the winner of the bet or print Draw in case no one wins the bet.

// Sample Input 0

// 14 15 9
// Sample Output 0

// Sonu
    public static void main(String args[]){
         Scanner scn = new Scanner(System.in);
         int a = scn.nextInt();
         int b = scn.nextInt();
         int c = scn.nextInt();
         if(a < b && a > c) {
            System.out.println("Sonu");
        }else if(b < a && b < c){
            System.out.println("Bob");
        }else{
            System.out.println("Draw");
        }
    }
}
