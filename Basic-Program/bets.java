import java.util.Scanner;

public class bets {
    public static void main (String args[]){
           Scanner scn = new Scanner(System.in);
             int a = scn.nextInt();
             int b = scn.nextInt();
             int c = scn.nextInt();
        if(c > b && c > a){
            System.out.println("Sonu");
        }else if(b > a){
            System.out.println("Bob");
        }else{
            System.out.println("Draw");
        }
    }
}
