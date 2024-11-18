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
        c.displayCars();
    }
}
