import java.util.Scanner;

public class Cars {
    private String carModel;
    private int carMFGYR;
    private Double carPrice;


    public Cars(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Model of the car:");
        this.carModel = scanner.nextLine();
        System.out.println("Manufacture year of the car:");
        this.carMFGYR = scanner.nextInt();
        System.out.println("Price of the car:");
        this.carPrice = scanner.nextDouble();
    }

    public void displayCars() {
        System.out.println("\nCars Details:");
        System.out.println("Model: " + carModel);
        System.out.println("Manufacture Year: " + carMFGYR);
        System.out.println("Price: RM" + carPrice);
    }

    public static void main(String[] args) {


        Cars c = new Cars();
        Cars c1 = new Cars();
        Cars c2 = new Cars();

        c.displayCars();
        c1.displayCars();
        c2.displayCars();
        
        Double AvgCarPrice = (c.carPrice + c1.carPrice + c2.carPrice)/3;
        System.out.println("\nAverage Car Price: RM" + String.format("%.2f", AvgCarPrice));
    }
}
