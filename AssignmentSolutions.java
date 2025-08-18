import java.util.Scanner;

public class AssignmentSolutions {



    // 1. Welcome
    public static void problem1_Welcome() {
        System.out.println("Welcome to Bridgelabz!");
    }

    // 2. Add Two Numbers
    public static void problem2_AddTwoNumbers(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
    }

    // 3. Celsius to Fahrenheit
    public static void problem3_CelsiusToFahrenheit(Scanner sc) {
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.println("Fahrenheit = " + f);
    }

    // 4. Area of Circle
    public static void problem4_AreaOfCircle(Scanner sc) {
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area = " + area);
    }

    // 5. Volume of Cylinder
    public static void problem5_VolumeOfCylinder(Scanner sc) {
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.println("Volume = " + volume);
    }

    // ---------------- Self Problems ----------------

    // 1. Simple Interest
    public static void problem6_SimpleInterest(Scanner sc) {
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time: ");
        double t = sc.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }

    // 2. Perimeter of Rectangle
    public static void problem7_PerimeterRectangle(Scanner sc) {
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        double perimeter = 2 * (l + w);
        System.out.println("Perimeter = " + perimeter);
    }

    // 3. Power Calculation
    public static void problem8_PowerCalculation(Scanner sc) {
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exp = sc.nextDouble();
        double result = Math.pow(base, exp);
        System.out.println("Result = " + result);
    }

    // 4. Average of Three Numbers
    public static void problem9_AverageThreeNumbers(Scanner sc) {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter third number: ");
        double c = sc.nextDouble();
        double avg = (a + b + c) / 3;
        System.out.println("Average = " + avg);
    }

    // 5. Kilometers to Miles
    public static void problem10_KmToMiles(Scanner sc) {
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Miles = " + miles);
    }

    // ---------------- Main Method ----------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Java Assignment Solutions");
        System.out.println("Choose a problem to run:");
        System.out.println("1. Welcome to Bridgelabz!");
        System.out.println("2. Add Two Numbers");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Area of Circle");
        System.out.println("5. Volume of Cylinder");
        System.out.println("6. Simple Interest");
        System.out.println("7. Perimeter of Rectangle");
        System.out.println("8. Power Calculation");
        System.out.println("9. Average of Three Numbers");
        System.out.println("10. Kilometers to Miles");
        System.out.print("Enter choice (1-10): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> problem1_Welcome();
            case 2 -> problem2_AddTwoNumbers(sc);
            case 3 -> problem3_CelsiusToFahrenheit(sc);
            case 4 -> problem4_AreaOfCircle(sc);
            case 5 -> problem5_VolumeOfCylinder(sc);
            case 6 -> problem6_SimpleInterest(sc);
            case 7 -> problem7_PerimeterRectangle(sc);
            case 8 -> problem8_PowerCalculation(sc);
            case 9 -> problem9_AverageThreeNumbers(sc);
            case 10 -> problem10_KmToMiles(sc);
            default -> System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
