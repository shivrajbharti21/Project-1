import java.util.*;
public class Menu_drive {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if(n == 1){
                System.out.println("Enter student Marks :");
                float marks = sc.nextFloat();
                if(marks >= 90){
                    System.out.println("This is Good");
                }
                else if(89 <= marks || marks>=60){
                    System.out.println("This is also Good");
                }
                else if(59<= marks || marks >=0){
                    System.out.println("This is Good as well");
                }

            }
            else if(n == 0){
                System.out.println("Stop");

            }
            else{
                System.out.println("Invalid Key\nUse only '0' and '1'");
            }
        }
    }
    
}
