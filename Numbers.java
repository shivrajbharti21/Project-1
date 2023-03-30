import java.util.*;
public class Numbers {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array: ");
            int size = sc.nextInt();
            int number[] = new int[size];

            for(int i=0; i<size; i++){
                number[i] = sc.nextInt();}

            int max = number[0];
            int min = number[0];
            for(int i=0; i<number.length; i++){
                if(number[i]< min){
                    min = number[i];
                }
                if(number[i]>max){
                    max = number[i];
                }
                
            }
            System.out.println("Largest number is: "+ max);
            System.out.println("Smallest number is: "+ min);
        }
    }
}
