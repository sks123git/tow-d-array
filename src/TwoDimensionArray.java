import java.util.Scanner;
// Program to demonstrate 2D array
public class TwoDimensionArray {
    public static void main(String[] args) {
        int rows,columns;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter the rows");
        rows = scanner.nextInt();
        System.out.println("Kindly enter the columns");
        columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        System.out.println("Enter the values in array");

        for (int i = 0; i<rows; i++){               //outer loop for row
            for (int j = 0; j<columns; j++){        //inner loop for column
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Displaying array values");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                System.out.println(array[i][j]);
            }
        }
    }
}