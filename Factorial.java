import java.util.*;
public class Factorial {
    public static void calcutaleFactorial(int a){
        if (a<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial =1;
        for(int i=a; i>=1; i--){
            factorial = factorial*i;
            
        }
        System.out.println(factorial);
        return;


    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();

            calcutaleFactorial(a);
        }

    }
}
