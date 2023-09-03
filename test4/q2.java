import java.util.Scanner;

public class q2 {
    public static void main(String args[]){
        // Given the time control of a chess match as a+b, determine which format of chess out of the given 4 it belongs to.

        // 1) Bullet if a+b < 3
        
        // 2) Blitz if 3 ≤ a+b ≤ 10
        
        // 3) Rapid if 11 ≤ a+b ≤ 60
        
        // 4) Classical if 60 < a+b
        
        // Input Format
        
        // First line contains two integers a and b separated by space.
        
        // Constraints
        
        // 1 <= a <= 100
        
        // 1 <= b <= 10
        // Output Format
        
        // Print 1 for bullet, 2 for blitz, 3 for rapid, 4 for classical.
        
        // Sample Input 0
        
        // 1 0
        // Sample Output 0
        
        // 1
      Scanner scn = new Scanner(System.in);
            int a = scn.nextInt() ,  b = scn.nextInt();
            if(a+b < 3){
                System.out.println(1);
            }else if(3<=a+b && a+b <= 10){
                System.out.println(2);
            }else if(11 <= a+b && a+b <= 60){
                System.out.println(3);
            }else if(60 < a+b){
                System.out.println(4);
            }

    }
}
