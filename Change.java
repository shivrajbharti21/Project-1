import java.util.*;
public class Change {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            String result = "";
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == 'e'){
                    result +='i';
                }
                else{
                    result += str.charAt(i);
                }
            }
            System.out.println(result);
        }
    }
}
