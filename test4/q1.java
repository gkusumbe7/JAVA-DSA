import java.util.Scanner;

public class q1 {
    public static void main(String args[]){
        // One hot summer day Pete and his friend Billy decided to buy a watermelon. They chose the biggest and the ripest one, in their opinion. After that the watermelon was weighed, and the scales showed w kilos. They rushed home, dying of thirst, and decided to divide the watermelon, however they faced a hard problem.

        // Pete and Billy are great fans of even numbers, that's why they want to divide the watermelon in such a way that each of the two parts weighs even number of kilos, at the same time it is not obligatory that the parts are equal. The boys are extremely tired and want to start their meal as soon as possible, that's why you should help them and find out, if they can divide the watermelon in the way they want. For sure, each of them should get a part of positive weight.
        
        // Input Format
        
        // The first (and the only) input line contains integer number w (1 ≤ w ≤ 100) — the weight of the watermelon bought by the boys.
        
        // Constraints
        
        // 1 ≤ w ≤ 100
        
        // Output Format
        
        // Print YES, if the boys can divide the watermelon into two parts, each of them weighing even number of kilos; and NO in the opposite case.
        
        // Sample Input 0
        
        // 8
        // Sample Output 0
        
        // YES
        // Explanation 0
        
        // For example, the boys can divide the watermelon into two parts of 2 and 6 kilos respectively (another variant — two parts of 4 and 4 kilos).
        
        // Sample Input 1
        
        // 9
        // Sample Output 1
        
        // NO


         Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
         if(n%2 == 0){
             System.out.println("YES");
         }else{
             System.out.println("NO");
         }


    }
}
