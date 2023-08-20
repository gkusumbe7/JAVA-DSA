package test2;
// King loves to go on tours with his friends.

import java.util.Scanner;

// King has N cars that can seat 5 people each and M cars that can seat 7 people each.Determine the maximum number of people that can travel together in these cars.

// Input Format

// First line contains two integers N and M

// Constraints

// 0≤N,M≤100

// Output Format

// Print an integer, maximum number of people that can travel together.

public class q1 {
    public static void main(String args[]){
         Scanner scn = new Scanner(System.in);
         int N = scn.nextInt();
         int M = scn.nextInt();
        int noPepTrav = 5*N + 7*M ;
        System.out.println(noPepTrav);
        
    
    }
}
