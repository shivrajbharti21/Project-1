import java.util.*;
public class Dublicate {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int da[] = new int[size];
            for(int i= 0; i<da.length; i++){
                da[i] = sc.nextInt();
            }
            
            int sum = ((size+1)*(size+2))/2;
            for(int i=0; i<da.length;i++){
                sum = sum-da[i];
            }
            System.out.println(sum);
        }
    }
}
