

import java.util.*;
public class MaxSum {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int []num = new int[6];
            int min =0;
            int max =0;
            // int totalsum =0;
            for(int i =0; i < 5; i++){
                num[i] = sc.nextInt();
            } 
            Arrays.sort(num);
            // for(int i=0; i<num.length; i++){
            // System.out.println(num[i]);}
            for(int i=0; i<5; i++){
                min = num[i] + min; 
                // System.out.println(min);
            }
            for(int i =5; i>1;i--){
                 max = num[i] + max;
                //  System.out.println(max);
            }
            System.out.print(min + " " + max);
            // System.out.print(max);
        }
    }
}
