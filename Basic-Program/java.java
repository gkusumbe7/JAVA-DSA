import java.util.Scanner;

public class java {
    public  static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int sum = n + m ;
        int sub = n - m ;
        int mod = n % m ;
        int mul = n * m ;
        int div = n / m ;

        System.out.println("Sum :"+sum);
        System.out.println("Sub :"+sub);
        System.out.println("Mod :"+mod);
        System.out.println("Mul :"+mul);
        System.out.println("Div :"+div);
    }
}
