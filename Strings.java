import java.util.*;
public class Strings {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            String str[] = new String[size];

            int length =0;
            for(int i =0; i<size; i++){
                str[i] = sc.next();
                length += str[i].length();
            }
            System.out.println(length);
        }

    }
}
