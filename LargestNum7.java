import java.util.*;
public class LargestNum7 {
    public static void main(String[] args) {
        int number[] = {45,34,67,87,23,20,30,0};
        System.out.println("The largest num in the array is: "+LargestNum(number));
    }
    public static int LargestNum(int number[]){
        int LargestNum = Integer.MIN_VALUE; //-infinity
        int SmallestNum = Integer.MAX_VALUE;//+infinity
        for(int i = 0 ; i < number.length ; i++ ){
            if(LargestNum < number[i]){
                LargestNum = number[i];
            }
            if(SmallestNum >number[i]){
                SmallestNum = number[i];
            }
        }

        System.out.println("The Smallest num is: "+SmallestNum);
        return LargestNum;//fun can return only one value thats y i have printed smallest inside the fun itself

    }
}
