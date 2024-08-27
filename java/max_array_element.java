import java.util.*;

public class max_array_element {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter array size :");
        int size=sc.nextInt();
        int max=0;
        
        System.out.println("Enter "+size+" array elements :");
        int[] arr=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }


        //Max array element
        for(int j=0;j<size;j++){
            if(max < arr[j]){
                max = arr[j];
                
                
            }
        }
        System.out.print("maximum element is : "+max);
    }
}
