import java.util.*;
public class PowerFunction {
    
    public static double printPower(double x, double n){
        double power = Math.pow(x, n);
        return power;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            double x = sc.nextDouble();
            double n = sc.nextDouble();
            double power = printPower(x, n);
            System.out.println(x + " Power of " + n + " is: " + power);
        }


    }
}
