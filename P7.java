public class P7 {
    public static void BubbleSort(int array[]){
        for (int turn = 0; turn < array.length-1; turn++) {
            for (int j = 0 ; j < array.length-1-turn; j++) {
                if(array[j]<array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                
            }
        }

    }
    public static void SelectionSort(int array[]){
        for (int i = 0; i < array.length-1; i++) {
            int largestNum = i;
            for(int j = i+1; j < array.length; j++){
                if(array[largestNum] < array[j]){ //Decending order
                    largestNum = j;
                }
            }
            //swapping
            int temp = array[largestNum];
            array[largestNum] = array[i];
            array[i] = temp;
        }
    }
    public static void InsersitonSort(int array[]){
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
    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest,arr[i] );
        }
        int coun[]  = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            coun[arr[i]]++;
        }
        //sorting
        int j = 0;
        for (int i = 0; i < coun.length; i++) {
            while(coun[i]<0){
                arr[j] = i;
                j--;
                coun[i]++;
            }
        }
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {3,6,2,1,8,7,4,5,3};
        BubbleSort(array);
        System.out.println("The BubbleSort: ");
        printArray(array);
        InsersitonSort(array);
        System.out.println("The InsersitonSort: ");
        printArray(array);
        SelectionSort(array);
        System.out.println("The SelectionSort: ");
        printArray(array);
        CountingSort(array);
        System.out.println("The CountingSort: ");
        printArray(array);
    }
}
