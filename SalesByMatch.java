import java.util.*;
public class SalesByMatch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
            int n = sc.nextInt();
            int sum =0;
            int arr[] = new int[n];
            for(int i =0; i<=arr.length; i++){
                arr[i] = sc.nextInt();
                
                }
                Arrays.sort(arr);
                for(int i = 0; i<=arr.length; i++){
                    for(int j =i+1; j<=arr.length; j++){
                        if(arr[j] - arr[i] == 0){
                            sum++;
                        }
                    }
                }
                System.out.println(sum);
        }
        } 
    

