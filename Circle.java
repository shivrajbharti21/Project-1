import java.util.*;
public class Circle {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int radius = sc.nextInt();
            float area_of_circle = 22/7 * (radius * radius);
            System.out.println("Area of Circle is :" + area_of_circle );
        } 
    }
}
