public class Concatenation {

    private int num1;
    private int num2;
    private int age;
    private double price;
    private boolean isLifeFun;
    private char grade;

    // Constructor to initialize the values
    public Concatenation(int num1, int num2, int age, double price, boolean isLifeFun, char grade) {
        this.num1 = num1;
        this.num2 = num2;
        this.age = age;
        this.price = price;
        this.isLifeFun = isLifeFun;
        this.grade = grade;
    }

    // Method to demonstrate concatenation scenarios
    public void print() {
        // Scenario (a): Concatenation of two integers
        System.out.println("Concat two numbers " + (num1 + num2)); 

        // Scenario (b): Concatenation of an integer and a string
        System.out.println("My age is: " + age); 

        // Scenario (c): Concatenation of a string and a double
        System.out.println("Price: " + price); 

        // Scenario (d): Concatenation of a boolean and a string
        System.out.println("Is life fun? " + isLifeFun); 

        // Scenario (e): Concatenation of a char and a string
        System.out.println("Grade: " + grade);

        // Scenario (f): Concatenation of multiple data types
        System.out.println("Scenario (f): Details: " + num1 + " " + price + " " + "abc" + " " + grade);
        // Output: Details: 5 19.99 abc A

        // Scenario (g): Concatenation of a string and a boolean
        System.out.println("Scenario (g): Life is fun: " + isLifeFun); 
    }

    public static void main(String[] args) {
        // Create an object of ConcatenationExamples
        Concatenation c = new Concatenation(5, 10, 25, 19.99, true, 'A');

        // Call the print method
        c.print();
    }
}
