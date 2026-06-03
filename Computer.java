public class Computer {

    // Chỉ cần viết các phương thức overload

    // 1. Chỉ basePrice
    public double calculatePrice(double basePrice) {
        System.out.println("[Using basePrice only]");
        return basePrice;
    }

    // 2. BasePrice + tax
    public double calculatePrice(double basePrice, double tax) {
        System.out.println("[Using basePrice + tax]");
        return basePrice + tax;
    }

    // 3. BasePrice + tax - discount
    public double calculatePrice(double basePrice, double tax, double discount) {
        System.out.println("[Using basePrice + tax + discount]");
        return basePrice + tax - discount;
    }

    // Main test
    public static void main(String[] args) {
        Computer comp = new Computer();

        double price1 = comp.calculatePrice(1000);
        System.out.println("Final Price = " + price1 + "\n");

        double price2 = comp.calculatePrice(1000, 100);
        System.out.println("Final Price = " + price2 + "\n");

        double price3 = comp.calculatePrice(1000, 100, 50);
        System.out.println("Final Price = " + price3);
    }
}