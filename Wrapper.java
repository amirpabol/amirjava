public class Wrapper {
    public static void main(String[] args) {
        int num = 10;
        Double numdouble = 7.474;
        float numfloat = 2.514f;
        char charprimitive = 'a';
        boolean isCorrect = true;

        Integer intWrap = Integer.valueOf(num);
        Double doubleWrap = Double.valueOf(numdouble); 
        Float floatWrap = Float.valueOf(numfloat);
        Character charWrap = Character.valueOf(charprimitive);
        Boolean booleanWrap = Boolean.valueOf(isCorrect);

        // Print out primitive variables and wrapper objects
        System.out.println("Primitive and Wrapper Class Demonstration:");
        System.out.println("Integer primitive: " + num);
        System.out.println("Integer wrapper: " + intWrap);

        System.out.println("Double primitive: " + numdouble);
        System.out.println("Double wrapper: " + doubleWrap);

        System.out.println("Float primitive: " + numfloat);
        System.out.println("Float wrapper: " + floatWrap);

        System.out.println("Character primitive: " + charprimitive);
        System.out.println("Character wrapper: " + charWrap);

        System.out.println("Boolean primitive: " + isCorrect);
        System.out.println("Boolean wrapper: " + booleanWrap);

    }
}
