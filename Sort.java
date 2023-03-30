import java.util.*;
public class Sort {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int acc [] = new int[size];
            for(int i=0; i<acc.length; i++){ 
                acc[i] = sc.nextInt();
            }

            Arrays.sort(acc); // shortcut method for sorting in assending order.
            
            for(int i=0; i<acc.length; i++)
            {System.out.println(acc[i]);}
        }
    }
}
