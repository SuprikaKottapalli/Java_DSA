public class SubArraySum12 {
    public static void SubArraySum(int num[]){
        int Currentsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int Start = i;
            for (int j = i ; j < num.length; j++) {
                int End = j;
                for (int k = Start ; k <= End ; k++) {
                    Currentsum += num[k];
                }
                System.out.println(Currentsum);
                if(maxSum < Currentsum){
                    maxSum = Currentsum;
                }
               
            }
        }
        System.out.println("The max sum is:"+maxSum);
        
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,-1,23,-3,0};
        SubArraySum(num);
    }
}
