public class Main {
    public static void main(String[] args) {
        System.out.println("2 + 4 = " + add(2, 4));
        System.out.println("2 - 4 = " + subtract(2, 4));
        System.out.println("2 * 4 = " + multiply(2, 4));
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
}

