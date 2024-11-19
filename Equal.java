public class Equal {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("String 1 == String 2 is " + (str1 == str2));

        System.out.println("String 1 == String 3 is " + (str1 == str3));

        System.out.println("String1.equals(str2): " + str1.equals(str2));
        System.out.println("String1.equals(str3): " + str1.equals(str3));
    }
}
