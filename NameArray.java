import java.util.*;
public class NameArray {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array : ");
            int size = sc.nextInt();

            String name[] = new String[size];
            for(int i = 0; i < size; i++){
                name[i] = sc.nextLine();
            }

            for(int i=0; i<name.length; i++){
                System.out.println("name " + (i+1) +" is: "+ name[i]);
            }
        }
    }
}
