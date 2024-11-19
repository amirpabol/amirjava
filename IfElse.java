public class IfElse {
    public static void main(String[] args) {
        int num = 2;

        if (num > 0){
            System.out.println("The number is positive");
        }
        else if (num%2 == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is negative");
        }
    }
}
