public class linearSearch4 {
    public static int linearSearch(int number[],int key){
        for (int i = 0; i < number.length; i++) {
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,3,4,6,7,10,19,20,8,17};
        int key = 7;

        int index = linearSearch(number, key);
        if(index == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("The index of key value is:"+index);
        }

    }
}
