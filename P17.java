public class P17 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,6} ;
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int nums[] ) {
        for(int i=0; i<nums.length-1 ; i++) {
             for(int j=i+1; j<nums.length ; j++ ) {
                 if( nums[i] == nums[j] ) {
                     return true ;
                     }
                 }
                
                }
                
            return false; 
        }
}
