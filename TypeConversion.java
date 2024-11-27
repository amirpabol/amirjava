public class TypeConversion {
    public static void main(String[] args) {
        // intialize int variable
        int num = 11;

        //instance of the Integer wrapper class
        Integer intWrap = Integer.valueOf(num); // Autoboxing

        // Converting int object ot int primitive
        int intFromWrapper = intWrap.intValue(); // Unboxing

        // Print the results
        System.out.println("Original int primitive: " + num);
        System.out.println("Integer wrapper object: " + intWrap);
        System.out.println("int primitive from Integer wrapper: " + intFromWrapper);
    }
}
