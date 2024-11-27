public class ArrayAssignment {
    private String[][] carModels;
    private int[][] carPrices= {
        {500000, 550000, 450000},
        {10000, 30000, 45000},
        {49000, 325000, 415000}
    };

    public ArrayAssignment() {
        
        carModels = new String[3][3];
        carModels[0][0] = "Supra";
        carModels[0][1] = "GTR";
        carModels[0][2] = "M3";
        carModels[1][0] = "Kancil";
        carModels[1][1] = "Axia";
        carModels[1][2] = "Saga";
        carModels[2][0] = "Myvi";
        carModels[2][1] = "A45";
        carModels[2][2] = "Mustang";

    }
    public static void main(String[] args) {
        ArrayAssignment a = new ArrayAssignment();

        System.out.println("Cars priced above 50,000 RM:");
        for (int i = 0; i < a.carModels.length; i++) {
            for (int j = 0; j < a.carPrices.length; j++) {

            if (a.carPrices[i][j] > 50000) {
                    System.out.println("Model: " + a.carModels[i][j] + ", Price: RM " + a.carPrices[i][j]);
                }
    
            }
        }
    }
}
