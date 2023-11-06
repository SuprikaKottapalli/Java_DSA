public class Operator {
    public static void main(String[] args) {
        System.out.println(5 & 6);// '&' is AND operator
        // ans: 4
        System.out.println(5 | 6);// '|' is OR operator
        // ans: 7
        System.out.println(5 ^ 6);// '^' is XOR operator
        // ans: 3
        System.out.println(~5);// '~' is NOT operator
        // ans: -6
        System.out.println(~0);
        // ans: -1
        System.out.println(5<<2);// '<<' is left shift operator
        // ans: 20
        System.out.println(5>>2);// '>>' is right shift operator
        // ans: 1
    }
}