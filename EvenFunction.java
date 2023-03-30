import java.util.*;
public class EvenFunction {
    
    public static void evenNumber(int a){
        if(a%2==0){
            System.out.println(a + " is an Even Number");
        }
        else{
            System.out.println(a + " is Not an Even Number");
        }
    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            evenNumber(a);
        }
    }
    
}
