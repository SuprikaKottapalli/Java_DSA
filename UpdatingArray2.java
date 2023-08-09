import java.util.*;
public class UpdatingArray2{
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Phy marks:");
        marks[0] = sc.nextInt();
        System.out.print("Chem marks:");
        marks[1] = sc.nextInt();
        System.out.print("Math marks:");
        marks[2] = sc.nextInt();

        System.out.println("Phy is: "+marks[0]+"\nChem is: "+marks[1]+"\nMath is: "+marks[2]);


        marks[0]= 99;  //this is the updated value
        System.out.println("Updated marks of phy is:"+marks[0]);

        System.out.println("length of array is :"+marks.length); //this gives the leangth of array

        int a = (marks[0]+marks[1]+marks[2]) / 3 ;
        System.out.println("The persentage of 3 subjects is :"+a);

    }
}