public class ReversArray9 {
    public static void main(String[] args) {
        int numberArray [] = {1,2,3,4,5,6,7,8,9,10};
        ReversArray(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i]+" ");
        }
    }

     public static void ReversArray(int numberArray[]){
        int First = 0, Last = (numberArray.length - 1);
        while (First < Last) {
            int temp = numberArray[Last];
            numberArray[Last] = numberArray[First];
            numberArray[First] = temp;
            First++;
            Last--;
        }
     }
}