import java.util.Scanner;

public class CoutDays {
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
           int d1 = 1 ;
           int d2 = 0 ;
           int d3 = 1 ;
           int d4 = 0 ;
           int d5 = 0 ;
           int d6 = 1 ;
           int d7 = 0 ;

           int sunnyDays = d1+d2+d3+d4+d5+d6+d7 ;
           if(sunnyDays > 3 ){
             System.out.println("Good Days");
           }else{
             System.out.println("Bad Days");
           }
           System.out.println(sunnyDays);
        
    }
}
