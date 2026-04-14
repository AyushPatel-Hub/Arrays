import java.util.Scanner;

public class arrayfind {
    public static void main(String[] args) {
        System.out.println("Enter the Size of Array-");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int Numbers[]=new int[size];
        for(int i=0;i<Numbers.length;i++){
            System.out.println("Enter the values-");
            Numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the Number you want to know the index of-");
        int x=sc.nextInt();
        for(int i=0;i<Numbers.length;i++){
            if(Numbers[i]==x){
                System.out.println("Index=" + i);


            }
        }
    }
}
