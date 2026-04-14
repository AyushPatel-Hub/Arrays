import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array-");
        int size= sc.nextInt();
        int number[]=new int[size];
        System.out.println("Enter the values in Array-");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        boolean isascending=true;
        
        for(int i=0;i<size-1;i++){
            if(number[i] > number[i+1]);
             isascending=false;
        }
        if(isascending){
            System.out.println("Ascending");
        } else{
            System.out.println("not in ascending");
        }
    }
}
