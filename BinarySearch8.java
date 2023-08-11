public class BinarySearch8 {
    public static void main(String[] args) {
        int SortedArray[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 9;
        System.out.println("The key found is:"+BinarySearch(SortedArray, key));
    }
    public static int BinarySearch(int SortedArray[],int key){
        int Start = 0;
        int End = SortedArray.length - 1 ;

        while(Start <= End){
            int mid = (Start + End)/2; //cal mid value
            if(SortedArray[mid]==key){//found
                return mid;
            }
            if(SortedArray[mid]<key){
               Start = mid + 1;  
            } else{
                End = mid - 1;
            }
        }
        return -1;
    }
}
