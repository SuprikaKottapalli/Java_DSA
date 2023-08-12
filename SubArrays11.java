public class SubArrays11 {
    public static void main(String[] args) {
        int num[] ={2,4,6,8,10};
        PrintSubArray(num);
    }
    public static void PrintSubArray(int num[]){
        for (int i = 0; i < num.length; i++) {
            int Start = i;
            for (int j = i ; j < num.length; j++) {
                int End = j;
                for (int k = Start ; k <= End ; k++) {
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
