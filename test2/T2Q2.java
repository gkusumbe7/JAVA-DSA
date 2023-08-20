package test2;
// Mohit has started a Ride Hailing Company.Based on the cost of a ride, his company has divided the ride taken into three categories,

import java.util.Scanner;

// Category 1: If the ride is below 200, then the ride is a regular ride.

// Category 2: If the ride is more than or equal to 200 and less than 500, then the ride is average ride.

// Category 3: If the ride is more than or equal to 500, then the ride is a premium ride.

// Input Format

// you will be given an integer input.

// Constraints

// 0<=N<=10^5

// Output Format

// print "regular ride" , "average ride" or "premium ride" accordingly.

// Sample Input 0

// 254
// Sample Output 0

// average ride

public class T2Q2 {
    public static void main(String args[]){
            Scanner scn = new Scanner(System.in);
          int rideCost = scn.nextInt();
          if(rideCost < 200){
              System.out.println("regular ride");
          }else if(rideCost >= 200 && rideCost < 500){
              System.out.println("average ride");
          }else if(rideCost >= 500){
              System.out.println("premium ride");
          }
    }
}
