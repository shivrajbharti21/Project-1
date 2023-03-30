import java.util.*;
public class Even {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int i = 2; i<= n; i = i+2){
                System.out.println(i);

            }
        }
        
    }
    
}
