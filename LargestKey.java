import java.util.*;

public class LargestKey {
    public static void main(String[] args) {
        int Matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);  // Create the Scanner object outside the loop

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }

        // Output the matrix
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        int key = 5;
        int largest = Largest(Matrix, key);

        
        if (largest > key) {
            System.out.println("The largest number greater than " + key + " is: " + largest);
        } else {
            System.out.println("No number greater than the key found.");
        }
    }

    public static int Largest(int Matrix[][], int key) {
        int largest = Integer.MIN_VALUE;  // Initialize with a very small value

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                if (Matrix[i][j] > key && Matrix[i][j] > largest) {
                    largest = Matrix[i][j];
                }
            }
        }
        
        return largest;
    }
}
