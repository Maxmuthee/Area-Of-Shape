import java.util.Scanner;
public class ShapeAreaCalculator {
    public static void calculateCircleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is:" + area );

    }
    public static void calculateRectangleArea() { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length and width of the rectangle: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("The area of the rectangle is: "+ area);
    }

    public static void calculateTriangleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base and height of the triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which shape do you want to calculate area for:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateCircleArea();
                break;
            case 2:
                calculateRectangleArea();
                break;
            case 3:
                calculateTriangleArea();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}