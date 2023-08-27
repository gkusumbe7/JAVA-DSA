package test3;

import java.util.Scanner;

public class q1 {
     public static void main(String args[]){
//         Given a string str, count the number of 's' and 'a' characters in it.

// Input Format

// First line contains a string str.

// Constraints

// 1 <= str.length <= 100
// Output Format

// print both's frequency in one line separated by space.

// Sample Input 0

// astronaut
// Sample Output 0

// 1 2
// Explanation 0

// Frequency of 's' is 1 and 'a' is 2
Scanner scn = new Scanner(System.in);
           String str = scn.next();
           int x = 0; 
           int y = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 's'){
                ++x;
            }else if(str.charAt(i) == 'a'){
                ++y;
            }
        }
        System.out.println(x+" "+y);
 
    }
}
