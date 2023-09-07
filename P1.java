public class P1 {
    public static void Num(int matrix[][],int key){
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==key){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7}};
        int key = 8;
        Num(matrix, key);
    }
}
