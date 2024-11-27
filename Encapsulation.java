public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be between 0 and 150.");
        }
    }

    static public void main(String[] args) {
        Encapsulation p = new Encapsulation();
        p.setName("John Doe");
        p.setAge(25);

        System.out.println("Name:" + p.getName());
        System.out.println("Age:" + p.getAge());
    }
}
