public class PrifixSubarray13 {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,7,8,8};
        SubArraySum(num);
    }
    public static void SubArraySum(int num[]){
        int Currentsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for(int i = 1; i<prefix.length ; i++){
            prefix[i] = prefix[i-1] + num[i];

        }
        for (int i = 0; i < num.length; i++) {
            int Start = i;
            for (int j = i ; j < num.length; j++) {
                int End = j;
                Currentsum = Start == 0 ? prefix[End] : prefix[End] - prefix[Start-1];
              
                if(maxSum < Currentsum){
                    maxSum = Currentsum;
                }
               
            }
        }
        System.out.println("The max sum is:"+maxSum);
        
    }
}
