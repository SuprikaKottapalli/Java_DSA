import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str = "CARE";
        String str1 = "RACE";
        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        if(str.length()==str1.length()){
            char[] strcharArray = str.toCharArray();
            char[] str1charArray = str1.toCharArray();

            Arrays.sort(strcharArray);
            Arrays.sort(str1charArray);
            boolean result = Arrays.equals(strcharArray,str1charArray);
            if(result){
                System.out.println(str + " and " + str1 + " are anagram of each other");
            } else{
                System.out.println(str + " and " + str1 + " are not anagram of each other");
            }
        } else{
            System.out.println(str + " and " + str1 + " are not anagram of each other");

            }

        
    }
}
