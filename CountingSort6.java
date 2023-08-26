public class CountingSort6 {
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
            while(coun[i]>0){
                arr[j] = i;
                j++;
                coun[i]--;
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
        int arr[] = {1,4,1,3,2,4,3,7};
        CountingSort(arr);
        printArray(arr);
    }
}
