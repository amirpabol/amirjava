public class Array {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 2;
        num[1] = 4;
        num[2] = 6;
        num[3] = 8;
        num[4] = 10;

        // for (int i=0;i < 5; i++){
        //     System.out.println(num[i]);
        // }

        for (int n: num){
            System.out.println(n);
        }
    
    }
}
