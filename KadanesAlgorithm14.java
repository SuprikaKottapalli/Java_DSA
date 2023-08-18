public class KadanesAlgorithm14{
    public static void main(String[] args) {
        int number[] = { -2 , -3 , 4 , -1 , -2 , 1 , 5 , -3 };
        KadanesAlgo(number);
    }
    public static void KadanesAlgo(int number[]){// the time complexity of kadanes is 'O(n)' this is most optimised code for calculating the max of subarray
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < number.length; i++) {
            cs += number[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);//The "Math.max" function gives the maximum value among the 2 numbers
        }
        System.out.println("Max subarray sum is:"+ms);
    }
}