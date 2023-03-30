import java.util.*;
public class TableFunctiion {
    
    public static void printTable(int a){
        for(int i=1; i<=10; i++){
            System.out.println(a*i);
        }
    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            printTable(a);
        }

    }
    
}
