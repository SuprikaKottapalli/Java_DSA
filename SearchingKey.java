import java.util.*;
public class SearchingKey {

    public static boolean Search(int Matrix[][], int key){
        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[0].length ; j++){
                if(Matrix[i][j]==key){
                    System.out.println("Found:" + "(" + i + "," + j + ")");
                    return true;
                }
            }
            System.out.println();
        }
        System.out.println("Not found");
        return false;
    }


    public static void main(String[] args) {
        int Matrix [] [] = new int [3][3];

        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[0].length ; j++){
                Scanner sc = new Scanner(System.in);
                Matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        //output
        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[0].length ; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }

        Search(Matrix, 5);
    }
}
