public class UpdatingArrayPro3 {

    public static void update(int marks[]){
        for(int i = 0 ; i< marks.length ; i++){
            marks[i] += 10;
        }
    }
    public static void main(String[] args) {
        int marks[] = {88,89,87};
        update(marks);//in array if value is updated in other function then that is refelcted on the main array 
        for(int i = 0 ; i < marks.length ; i++){ //loop runs till the lenght of array
            System.out.print(marks[i]+" ");
        }
    }
}
