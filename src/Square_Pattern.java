import java.util.Scanner;

public class Square_Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Rows");
        int Row = sc.nextInt();
        System.out.println("Enter Number Of Columns");
        int col = sc.nextInt();

        for (int i=0;i<Row;i++){
            for (int j=0;j<col;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Hallow Square
        System.out.println();
        System.out.println("Hallow Square");
        System.out.println();

        for (int i=0;i<Row;i++){
            for (int j=0;j<col;j++){
                if(i==0||i==Row-1||j==0||j==col-1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
