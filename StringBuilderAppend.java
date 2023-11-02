public class StringBuilderAppend {
    public static void main(String[] args) {
        
        StringBuilder sd = new StringBuilder("");
         for(char ch = 'a'; ch <= 'z'; ch++ ){
            sd.append(ch);//append is used to add elements at the end
        }
        System.out.println(sd.length());// abcdefghijklmnopqrstuvwxyz 
    }

}
