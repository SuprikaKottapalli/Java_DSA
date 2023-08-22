import java.util.Arrays;
import java.util.Collections;
public class InbuildSort5 {
    public static void main(String[] args) {
        int array[] = {5, 3, 4, 1, 2};
       
        System.out.print("Sorting Array using Index: ");
        Arrays.sort(array,0,3);// Array.sort(Array_name , Starting index , Ending Index)
        PrintArray(array);

        System.out.print("Sorting Array without Index: ");
        Arrays.sort(array);//Directly sorts array
        PrintArray(array);


        //Decending order
        Integer arr[] = {5, 3, 4, 1, 2};

        System.out.print("Sorting Array Decending Order using collections: ");
        Arrays.sort(arr,Collections.reverseOrder());//this works on objects
        PrintArrayCollection(arr);

        System.out.print("Sorting Array Decending Order using collections and without indexes: ");
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        PrintArrayCollection(arr);

   }
    public static void PrintArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void PrintArrayCollection(Integer arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}
