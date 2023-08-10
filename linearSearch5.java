import javax.print.DocFlavor.STRING;

public class linearSearch5 {
    public static void main(String[] args) {
        String Menu[] = {"Biryani","jeera rice","pulav","egg rice","fried rice"};
        String key = "pulav" ;
        int retunType = linearSearch(Menu, key);
        if(retunType == -1){
            System.out.println("The Keu is not found");
        } else{
            System.out.println("Found Key:"+retunType);
        }
    }
    public static int linearSearch(String Menu[],String key){
        for (int i = 0; i < Menu.length; i++) {
            if (Menu[i]==key) {
                int result =  i;
                return i;
            } 
        }
        return -1;
    }
}
