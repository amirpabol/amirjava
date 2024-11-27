public class TypeCasting {
    public static void main(String[] args) {
        // Declare and initialize primitive variables
        int intPrimitive = 100;
        double doublePrimitive = 45.67;
        float floatPrimitive = 3.14f;
        char charPrimitive = 'C';
        boolean booleanPrimitive = true;

        System.out.println("Type Casting Demonstration:");

        // Implicit and Explicit Casting between primitives
        double intToDouble = intPrimitive; // Implicit casting
        System.out.println("int to double: " + intToDouble);

        int doubleToInt = (int) doublePrimitive; // Explicit casting
        System.out.println("double to int: " + doubleToInt);

        int floatToInt = (int) floatPrimitive; // Explicit casting
        System.out.println("float to int: " + floatToInt);

        int charToInt = (int) charPrimitive;
        System.out.println("char to int (ASCII value): " + charToInt);
     
        char intToChar = (char) intPrimitive;
        System.out.println("int to char: " + intToChar);

        // Using wrapper classes for conversions
        System.out.println("\nWrapper Class Conversions:");

        String intToString = Integer.toString(intPrimitive);
        System.out.println("Integer to String: " + intToString);

        int stringToInt = Integer.parseInt(intToString);
        System.out.println("String to Integer: " + stringToInt);

        String doubleToString = Double.toString(doublePrimitive);
        System.out.println("Double to String: " + doubleToString);

        double stringToDouble = Double.parseDouble(doubleToString);
        System.out.println("String to Double: " + stringToDouble);

        String booleanToString = Boolean.toString(booleanPrimitive);
        System.out.println("Boolean to String: " + booleanToString);

        boolean stringToBoolean = Boolean.parseBoolean(booleanToString);
        System.out.println("String to Boolean: " + stringToBoolean);
    }
}
