import java.util.*;
public class CircumferenceFunction {
    
    public static int printCircumference(int r){
        int cricumference = 2 * r * 22/7 ;
        return cricumference;

    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            int cricumference = printCircumference(r);
            System.out.println("Your cricumference of circle is: " + cricumference);
        }
    }
}
