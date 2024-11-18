public class VariableScope {
    int instanceVariable = 10;
    static int staticVariable = 20;
    String instaString = "Aiyaiyai";

    public static void main(String[] args) {
        int localVariable = 30;
        System.out.println("Local variable " + localVariable);
        System.out.println("Static variable: " + staticVariable);
        VariableScope variableScope = new VariableScope();
        System.out.println("Instance variable: " + variableScope.instanceVariable);
        System.out.println("Instance string: " + variableScope.instaString);
    }

}
