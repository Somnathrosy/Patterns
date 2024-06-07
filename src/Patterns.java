import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        int Row = sc.nextInt();;
        for (int i=0;i<=Row;i++){
            for (int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
