import java.util.Scanner;

public class IfElseSwitchAssign {
    
    private String carModel;

    public IfElseSwitchAssign(){

        Scanner s = new Scanner(System.in);

        System.out.println("What is your car model?");
        this.carModel = s.nextLine();

    }

    public static void main(String[] args) {
        Double carPrice;

        IfElseSwitchAssign cars = new IfElseSwitchAssign();
        
        switch(cars.carModel) {
            case "Toyota":
                carPrice = 70000.00;
                break;
            case "Proton":
                carPrice = 50000.00;
                break;
            case "Mercedes":
                carPrice = 120000.00;
                break;
            case "BMW":
                carPrice = 110000.00;
                break;
            case "Perodua":
                carPrice = 40000.00;
                break;
            default:
                carPrice = 0.00;
                break;
        }

        if(carPrice >= 100000){
            System.out.println("The buyer is a VIP.");
            System.out.println("Car Model is " + cars.carModel + ". The price is RM" + String.format("%.2f", carPrice));
        }
        else if (carPrice == 0) {
            System.out.println("The car model is not in the system.");
        }
        else{
            System.out.println("The buyer is not a VIP.");
            System.out.println("Car Model is " + cars.carModel + ". The price is RM" + String.format("%.2f", carPrice));
        }

    }
}
