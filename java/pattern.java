public class pattern{
    public static void main(String args[]){
       
       //pyramid
       System.out.println("star pyramid");
        for(int i=0;i<5;i++){
            for(int j=i;j<5-1;j++){//0 4 || 1 4 || 2 4 || 3 4  ||  4 4
                System.out.print(" ");// empty | 5 | 4 6 |  3 5 7 |  2 4 6 8
             }
            for(int k=0;k<i;k++){
                System.out.print(" *");// important line(focus on space) (statment)   
            }
            
            System.out.println();

        }

    System.out.println("\n\n reverse pyramid");
    for(int i=0;i<5;i++){
        for(int j=i;j<5-1;j++){//0 4 || 1 4 || 2 4 || 3 4  ||  4 4
            System.out.print(" ");
        }
        for(int k=0;k<i;k++){
            System.out.print("*");
        }
        
        System.out.println();

    }

    System.out.println("\n\n number pyramid 1");
        for(int i=1;i<4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
       }


    System.out.println("\n\n number pyramid 2");
        for(int i=1;i<4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
