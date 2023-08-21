public class SelectionSort3 {
    public static void SelectionSortAccending(int array[]){
        for (int i = 0; i < array.length-1; i++) {
            int smallestNum = i;
            for(int j = i+1; j < array.length; j++){
                if(array[smallestNum] > array[j]){ //Acending order
                    smallestNum = j;
                }
            }
            //swapping
            int temp = array[smallestNum];
            array[smallestNum] = array[i];
            array[i] = temp;
        }
    }
    public static void SelectionSortDecending(int array[]){
        for (int i = 0; i < array.length-1; i++) {
            int largestNum = i;
            for(int j = i+1; j < array.length; j++){
                if(array[largestNum] < array[j]){ //Acending order
                    largestNum = j;
                }
            }
            //swapping
            int temp = array[largestNum];
            array[largestNum] = array[i];
            array[i] = temp;
        }
    }


    public static void PrintArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {5, 4, 1, 3, 2};
        SelectionSortAccending(array);
        System.out.print("The Accending array is: ");
        PrintArray(array);
        SelectionSortDecending(array);
        System.out.print("The Decending array is: ");
        PrintArray(array);
    }
}

