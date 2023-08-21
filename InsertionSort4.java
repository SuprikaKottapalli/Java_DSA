public class InsertionSort4 {
    public static void InsertionSortAccending(int array[]){
        for (int i = 1; i < array.length; i++) {
            int currentPosition = array[i];
            int previousPosition = i-1;
            //finding out correct position to insert
            while (previousPosition >=0 && currentPosition < array[previousPosition]) {
                array[previousPosition +1] = array[previousPosition];
                previousPosition--;
            }
            //inserting
            array[previousPosition+1] = currentPosition;
        }
    
    }
 public static void InsertionSortDecendding(int array[]){
        for (int i = 1; i < array.length; i++) {
            int currentPosition = array[i];
            int previousPosition = i-1;
            //finding out correct position to insert
            while (previousPosition >=0 && currentPosition > array[previousPosition]) {
                array[previousPosition +1] = array[previousPosition];
                previousPosition--;
            }
            //inserting
            array[previousPosition+1] = currentPosition;
        }
    
    }
public static void PrintArray(int array[]){
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
public static void main(String[] args) {
            int array[] = {1, 2, 3, 4, 5};
            InsertionSortAccending(array);
            System.out.print("The Accending array is: ");
            PrintArray(array);
            InsertionSortDecendding(array);
            System.out.print("The Decending array is: ");
            PrintArray(array);
        }
}
