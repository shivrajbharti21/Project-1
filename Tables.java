import java.util.*;
public class Tables {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            for(int i=1; i<=10; i++){
                System.out.println(x * i );
            }
        }
    }
}
