public class ArrayTwoD {
    public static void main(String[] args) {
        int[][] a = new int[3][4];

        int[][] b = {
            {1,2,3,4},
            {5,6,7,8},
             {9,10,11,12}
        };

        for (int[] b1 : b) {
            for (int j = 0; j < b1.length; j++) {
                System.out.print(b1[j] + " ");
            }
            System.out.println();
        }

        for(int c[]: b){
            for(int d: c){
                System.out.print(d + " ");
            }
            System.out.println();
        }

    }
}
