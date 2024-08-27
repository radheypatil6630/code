import java.util.*;

public class Reverse_string {

    public static void main(String[] args) {
    
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter string :");
        String str=Sc.next();

        String[] reverse=str.split("");
        
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(reverse[i]);
        }
    }
}
