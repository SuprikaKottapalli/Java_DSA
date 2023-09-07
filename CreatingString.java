import java.util.*;
public class CreatingString{
    public static void main(String[] args) {
        //String are Immutable
        String str =  "Suprika";
        String str2 = new String("Kottapalli");
        System.out.println(str+" "+str2);


        // //taking input
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();//it takes only single word and not considers if there is space
        // // e.g: Input: Suprika Kottapalli Output: Suprika
        // System.out.print(name);
                


    // taking input
    Scanner sc = new Scanner(System.in);

   
    String name = sc.next(); // Read a single word
    sc.nextLine(); // Consume the newline character left in the buffer

    System.out.print(name);

   
    String name1 = sc.nextLine(); // Read a line
    System.out.print(name1);
        
    }
}