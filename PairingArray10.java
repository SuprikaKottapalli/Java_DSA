public class PairingArray10 {
    public static void main(String[] args) {
        int number[] = {2,4,4,3,5,6,7,8,9};
        PairingArray(number);
    }
    public static void PairingArray(int number[]){
        int totalPairs = 0;
        for (int i = 0; i < number.length; i++) {
            int currentNum = number[i];
            for (int j = i+1; j < number.length; j++) {
                System.out.print("("+currentNum+","+number[j]+") ");
                totalPairs ++;
            }
            System.out.println();
        }
        System.out.println("Total paires : "+totalPairs);//Math formula for tp is " Total pair = n(n+1) / 2 " this gives num of pairs
    }
}
