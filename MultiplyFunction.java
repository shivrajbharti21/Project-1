import java.util.*;

public class MultiplyFunction {
    
    public static float calculateMultiplaction(float a, float b){
        float value = a*b;
        return value;
    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            float a = sc.nextFloat();
            float b = sc.nextFloat();

            float value = calculateMultiplaction(a, b);
            System.out.println("Multiplication of two numbers is :"+value);
        }

    }
    
}
