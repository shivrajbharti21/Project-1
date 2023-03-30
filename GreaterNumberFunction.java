import java.util.*;
public class GreaterNumberFunction {
    
    public static void printGreater(int a, int b){
    
        if(a<b){
            System.out.println(b+" is Greater");
        }else{
            System.out.println(a+" is Greater");
        }
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            printGreater(a, b);
        }
    }
}
