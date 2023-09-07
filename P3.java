public class P3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {11, 12, 13},
            {21, 22, 23}};

            int numRows = matrix.length;
            int numCols = matrix[0].length;
    
            // Create a new matrix for the transpose
            int[][] transpose = new int[numCols][numRows];
    
            // Find the transpose by swapping rows with columns
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    transpose[j][i] = matrix[i][j];
                }
        }
    
            // Print the original matrix
            System.out.println("Original Matrix:");
            printMatrix(matrix);
    
            // Print the transposed matrix
            System.out.println("Transposed Matrix:");
            printMatrix(transpose);
        }
    
        // Helper method to print a matrix
        public static void printMatrix(int[][] mat) {
            for (int[] row : mat) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }

