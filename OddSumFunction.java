import java.util.*;
public class OddSumFunction {
    
    public static int printOddSum(int n){
        int os = 0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                os = os + i;
            }
        }
        return os;
    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int os = printOddSum(n);
            System.out.println("Sum of n Odd Number is: " + os);
        }
    }
}
