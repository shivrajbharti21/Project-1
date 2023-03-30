import java.util.*;
class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num <=1){
            System.out.println("Given Number is not Prine");
        }
        else{
            for(int i =2; i<num/2; i++){
                if(num%i == 0){
                    System.out.println("Given Number is not prime");
                }
                else{
                    System.out.println("Given Number is prime");
                }
            }
        }
    }
}