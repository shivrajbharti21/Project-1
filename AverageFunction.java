import java.util.*;
public class AverageFunction {
    
    public static int printAverage(int a, int b, int c){
        int average = (a + b + c)/3;
        return average;
    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("Average of three Number is: "+ printAverage(+ a, b, c));
        }
    }
    
}
