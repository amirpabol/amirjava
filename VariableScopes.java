public class VariableScopes {
        // Global variable
        int num = 100;
    
        // Method to demonstrate variable scopes
        public void demonstrateScope() {
            // Local variable with the same name as the global variable
            int num = 50;
    
            // Printing the value of the local variable
            System.out.println("Local variable num: " + num);
    
            // Printing the value of the global variable using 'this' keyword
            System.out.println("Global variable num: " + this.num);
        }
    
        public static void main(String[] args) {
            // Create an instance of VariableScopeDemo
            VariableScopes demo = new VariableScopes();
    
            // Call the method to demonstrate scope
            demo.demonstrateScope();
        }
    
}
