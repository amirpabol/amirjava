public class Geometry {
    private double radius;
    private double length;
    private double width;
    private double base;
    private double height;
    private boolean isTriangle;

    public double area(double radius){

        return Math.PI * radius * radius;
    }

    public double area(double length, double width){
        return length * width;
    }

    public double area(double base, double height, boolean isTriangle){
        if (isTriangle) {
            return 0.5 * base * height; // Area for triangle
        } else {
            return base * height; // Area for rectangle or parallelogram
        }
    }

    public static void main(String[] args) {

        Geometry geometry = new Geometry();

        System.out.println("Area of circle: " + geometry.area(12.5));
        System.out.println("Area of rectangle: " + geometry.area(7.5, 5.5));
        System.out.println("Areo of triangle: " + geometry.area(6.0,8.0, true));

    }

}
