import java.util.*;
public class Digit {
 public static void main(String[] args) {
    int n, temp, digit, count=0;  

    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter any number: ");  
    
    n=sc.nextInt();  
    
    temp=n;  
    while(n>0)  
    {  
    n=n/10;  
    count++;  
    }  
    while(temp > 0)  
{  

digit=temp%10;  

System.out.println(digit);  
temp=temp/10;  

count--;  
}
}}
    


    

