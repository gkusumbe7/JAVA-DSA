import java.util.Scanner;

public class q4 {
    public static void main(String args[]){
//         Nikolay has a lemons, b apples and c pears. He decided to cook a compote. According to the recipe the fruits should be in the ratio 1: 2: 4. It means that for each lemon in the compote should be exactly 2 apples and exactly 4 pears. You can't crumble up, break up or cut these fruits into pieces. These fruits — lemons, apples and pears — should be put in the compote as whole fruits.

// Your task is to determine the maximum total number of lemons, apples and pears from which Nikolay can cook the compote. It is possible that Nikolay can't use any fruits, in this case print 0.

// Input Format

// The first line contains the positive integer a (1 ≤ a ≤ 1000) — the number of lemons Nikolay has.

// The second line contains the positive integer b (1 ≤ b ≤ 1000) — the number of apples Nikolay has.

// The third line contains the positive integer c (1 ≤ c ≤ 1000) — the number of pears Nikolay has.

// Constraints

// 1 ≤ a ≤ 1000

// 1 ≤ b ≤ 1000

//  ≤ c ≤ 1000

// Output Format

// Print the maximum total number of lemons, apples and pears from which Nikolay can cook the compote.

// Sample Input 0

// 2
// 5
// 7
// Sample Output 0

// 7
// Explanation 0

// In the first example Nikolay can use 1 lemon, 2 apples and 4 pears, so the answer is 1 + 2 + 4 = 7.

// Sample Input 1

// 4
// 7
// 13
// Sample Output 1

// 21
// Explanation 1

// In the second example Nikolay can use 3 lemons, 6 apples and 12 pears, so the answer is 3 + 6 + 12 = 21.
Scanner scn = new Scanner(System.in);
         int lemon = scn.nextInt(); 
         int apple = scn.nextInt();
         int pears = scn.nextInt();
        // 1:2:4 
        // after the ratio 
          int l = lemon / 1 ;
          int a = apple / 2 ;
          int p = pears / 4 ;
        
          int  s = l ;
          if(a < s){
              s = a ;
          }
          if(p < s){
              s = p;
          }
        
        int ans = ( s * 1) + (s * 2) + ( s * 4);
        System.out.println(ans);

    }
}
