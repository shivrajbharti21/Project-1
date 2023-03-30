// name.compareTo is a inbuild function that compare two strings, who among them is smaller and which one is larger.
// if s1 > s2 return +ve value
// if s1 = s2 return 0
// if s1 < s2 return -ve value 
import java.util.*;

public class Lexicographical {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            int k = sc.nextInt();
            String smallest = s.substring(0,k);
            String largest = s.substring(0, k);
            for(int i =0; i<=s.length()-k;i++){
                String sTemp = s.substring(i, i+k);
                if(sTemp.compareTo(smallest)<0){
                    smallest = sTemp;
                }
                if(sTemp.compareTo(largest)>0){
                    largest = sTemp;
                }
            }
            System.out.println(smallest + "\n" + largest);
        }
    }
}
