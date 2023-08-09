public class Array1 {
    public static void main(String[] args) {
        int My_1st_Array [] = new int[50]; //here i have created array but i didn't enter elements so java takes '0' as default 
        // which means an array is created in java of size 50 but its is empty until we update it 
        // here it has all zeros like {0,0,0,0,.....(50times)}

        int My_2nd_Array[] = {1,2,3,4}; //here java takes 3 as the size of the array as default

        char My_3rd_Array[] = {'a','b','c','d'}; //char

        char My_4th_Array[] = new char[10];//java takes empty charecters as default

        String My_5th_Array[] = {"apple","mango"}; //string

        String My_6th_Array[] = new String[5]; //java takes empty strings as default
        
    }
}