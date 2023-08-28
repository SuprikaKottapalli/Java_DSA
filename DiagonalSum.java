public class DiagonalSum {

    public static int Diagonal(int matrix[][]){
        int Sum = 0;
        // for(int i = 0 ; i < matrix.length ; i++){
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if(i==j){ //Diagonal of primary matrix
        //             Sum += matrix[i][j];
        //         }
        //         if( i + j == matrix.length - 1){
        //             Sum += matrix[i][j];
        //         }
        //     }

        // }
        
        //More Optimised code
        for (int i = 0; i < matrix.length; i++) {
            //Primary Diagonal
            Sum += matrix[i][i];
            //Secondary Diagonal
            if(i != matrix.length - i - 1){
                Sum += matrix[i][matrix.length-i-1];
            }
        }
        return Sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(Diagonal(matrix));
    }
    
}
