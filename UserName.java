import java.util.*;
public class UserName {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            String email = sc.next();
            String username = "";
            for(int i =0; i<email.length(); i++){
                if(username.charAt(i) == '@'){
                    break;
                }else{
                    username += email.charAt(i);
                }
            }
            System.out.println(username);
        }
    }
}
