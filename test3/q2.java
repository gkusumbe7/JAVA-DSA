package test3;

import java.util.Scanner;

public class q2 {
    public static void main(String args[]){
//   Apple considers any iPhone with a battery health of 80% or above, to be in optimal condition. Given that your iPhone has X% battery health, find whether it is in optimal condition.

// Input Format

// First line contains X

// Constraints

// 1<=X<=100

// Output Format

// Print Yes if its in optimoal condition, else print No.

// Sample Input 0

// 98
// Sample Output 0

// Yes

Scanner scn = new Scanner(System.in);
           int battery = scn.nextInt();
         if(battery >= 80 ){
             System.out.println("Yes");
         }else{
             System.out.println("No");
         }

    }
}
