public class privateVariable {
    private String name;
    private int age;
    private boolean isAlive;
    private long networth;
    private double salary;

    public privateVariable(String name, int age, boolean isAlive, long networth, double salary) {

        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
        this.networth = networth;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is alive: " + isAlive);
        System.out.println("Networth: " + networth);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        privateVariable pv = new privateVariable("Abu", 99, false, 99999999999L, 10000);
        pv.displayDetails();
    }
}
