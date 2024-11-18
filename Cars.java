
public class Cars {
    private String carModel;
    private int manufactureYear;
    private Double carPrice;

    private Cars(String carModel, int manufactureYear, Double carPrice) {
        this.carModel = carModel;
        this.manufactureYear = manufactureYear;
        this.carPrice = carPrice;
    }

    public void displayCars() {
        System.out.println("Cars Details:");
        System.out.println("Model: " + carModel);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Price: RM" + carPrice);
    }



    public static void main(String[] args) {
        Cars c = new Cars("Toyota Vios", 2020, 123000.01);
        Cars c1 = new Cars("Toyota Camry", 2020, 126000.01);
        Cars c2 = new Cars("Toyota Altis", 2019, 130000.01);

        c.displayCars();
        c1.displayCars();
        c2.displayCars();
        
        Double AvgCarPrice = (c.carPrice + c1.carPrice + c2.carPrice)/3;
        System.out.println("Average Car Price: RM" + AvgCarPrice);

    }
}
