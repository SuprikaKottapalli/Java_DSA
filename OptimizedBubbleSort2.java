public class OptimizedBubbleSort2 {
    public static void BubbleSort(int array[]){
        for (int turn = 0; turn < array.length-1; turn++) {
            int swap = 0;
            for (int j = 0; j < array.length-1-turn; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                swap++;
            }
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
        BubbleSort(array);
        PrintArray(array);
    }
}
