public class P2 {
    public static void main(String[] args) {
        int matrix[][] = {{1,  4, 9},//(0,0),(0,1),(0,2)
                          {11, 4, 3},//(1,0),(1,1),(1,2)
                          {2,  2, 3}};//(2,0),(2,1),(2,2)
        int counter = 0;

        //Printing the sum of 2nd row only
        for (int j = 0; j < matrix[1].length; j++) {
                
                    counter += matrix[1][j];
                
            }
        
        System.out.println(counter);
    }
}
