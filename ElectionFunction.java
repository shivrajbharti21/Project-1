import java.util.*;
public class ElectionFunction {
    
    public static void vote(int age){
        if(age>=18){
            System.out.println("Eligible for Vote");
        }
        else{
            System.out.println("Not Eligible for Vote");
        }

    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            vote(age);
        }
    }
}
