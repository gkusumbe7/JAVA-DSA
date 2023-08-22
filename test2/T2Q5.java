 package test2;

import java.util.Scanner;

// The weather report of Chefland is Good if the number of sunny days in a week is strictly greater than the number of rainy days. Given 7 integers A1, A2, A3, A4, A5, A6, A7 where Ai=1 denotes that the ith day of week in Chefland is a sunny day, Ai=0 denotes that ith day in the chefland is rainy day. Determine if the weather report of chefland is Good or not.

// Input Format

// First line contains 7 separated integers A1, A2, A3, A4, A5, A6, A7.

// Constraints

// 0≤Ai≤1

// Output Format

// For each testcase, print "YES" if the weather report of Chefland is Good, otherwise print "NO". Print the output without quotes.

// Sample Input 0

// 1 0 1 0 1 1 1
// Sample Output 0

// YES
// Explanation 0

// The number of sunny days is 5 and the number of rainy days is 2. Hence the weather report of Chefland is Good.

public class T2Q5 {
    public static void main(String args[]){
              Scanner scn = new Scanner(System.in);
        int A1 = scn.nextInt();
        int A2 = scn.nextInt();
        int A3 = scn.nextInt();
        int A4 = scn.nextInt();
        int A5 = scn.nextInt();
        int A6 = scn.nextInt();
        int A7 = scn.nextInt();
        int sunnyDays = A1+A2+A3+A4+A5+A6+A7;
        int rainyDays = 3;
        if(sunnyDays > rainyDays){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
