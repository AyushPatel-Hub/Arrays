import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of Row-");
        int row= sc.nextInt();
        System.out.println("Enter the Number of colm-");
        int colm=sc.nextInt();
        int [][] numbers=new int[row][colm];
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Target value-");
        int target=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                if(numbers[i][j]==target){
                    System.out.println(i + j);
                }
            }
        }
    }
}
