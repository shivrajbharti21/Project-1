import java.util.*;
public class Calculator {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Key 1 : Addition\nKey 2 : Subtraction\nKey 3 : Multiplication\nKey 4 : Division");
            int keys = sc.nextInt();
            switch(keys){
                case 1:
                System.out.println("Enter your numbers :");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a + b);
                break;
                case 2:
                System.out.println("Enter your numbers :");
                int c = sc.nextInt();
                int d = sc.nextInt();
                System.out.println(c-d);
                break;
                case 3:
                System.out.println("Enter your numbers :");
                int e = sc.nextInt();
                int f = sc.nextInt();
                System.out.println(e*f);
                break;
                case 4:
                System.out.println("Enter your numbers :");
                int g = sc.nextInt();
                int h = sc.nextInt();
                System.out.println(g/h);
                break;
                default :
                System.out.println("Invalid key");

            }
        }
    }
    
}
