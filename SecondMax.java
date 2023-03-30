import java.util.*;
public class SecondMax {
    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int sm[] = new int[size];
            for(int i=0; i<sm.length; i++){
                sm[i] = sc.nextInt();
            }
            Arrays.sort(sm);
            System.out.println("Second Max value is: "+ sm[size-2]);
            System.out.println("Second Min value is: "+ sm[1]);
        }
    }
}
