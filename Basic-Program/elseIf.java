import java.util.Scanner;

public class elseIf {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);    // Find Second largest Number 
          int a = scn.nextInt();
          int b = scn.nextInt();
          int c = scn.nextInt();
        
          if(a > b && a > c ){
              if(b > c){
                System.out.println(b);
              }else{
                System.out.println(c);
              }
          }else if ( b > c ){
            if(a > c){
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
