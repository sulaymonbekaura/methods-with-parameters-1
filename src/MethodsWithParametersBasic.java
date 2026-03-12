public class MethodsWithParametersBasic {

    // Greet with a name
    static void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome.");
    }

    // Add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Check if a number is even
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Print a line of repeated character
    static void printLine(char ch, int count) {
        for (int i = 0; i < count; i++) System.out.print(ch);
        System.out.println();
    }

    // Calculate circle area
    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Convert km to miles
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    // Check if a year is leap year
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        greet("Alice");
        greet("Bob");

        System.out.println("\n=== Calculations ===");
        System.out.println("add(5, 3)   = " + add(5, 3));
        System.out.println("add(100, 200) = " + add(100, 200));

        System.out.println("\n=== Even/Odd ===");
        for (int n : new int[]{1,2,3,4,10,15})
            System.out.printf("%3d is %s%n", n, isEven(n) ? "even" : "odd");

        System.out.println("\n=== Lines ===");
        printLine('=', 30);
        printLine('-', 20);
        printLine('*', 10);

        System.out.println("\n=== Circle Areas ===");
        for (double r : new double[]{1, 5, 10, 3.14})
            System.out.printf("radius=%.2f → area=%.4f%n", r, circleArea(r));

        System.out.println("\n=== Leap Years ===");
        for (int y : new int[]{2000,1900,2024,2023})
            System.out.printf("%d: %s%n", y, isLeapYear(y) ? "leap" : "not leap");
    }
}
