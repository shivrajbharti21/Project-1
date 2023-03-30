import java.util.*;
public class MigratoryBirds {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int ans = 0; 
        int n = sc.nextInt();
        int arr[] = new int[n];
        int brr[] = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i< arr.length;i++){
            int count = 1;
            if(arr[i] != -1){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    arr[j] = -1;
                }
            }
        
            brr[i] = count;
            }}
            
            for(int i = 0; i< brr.length; i++){
                 if(brr[i]> max){
                     max = brr[i];
                     }
                     
            }
            System.out.println(max);
    }
}
