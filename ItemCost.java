import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String name = input.nextLine();

        System.out.print("Enter price per item: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        if (price < 0 || quantity < 0) {
            System.out.println("Error: price and quantity cannot be negative.");
            input.close();
            return;
        }

        double total = price * quantity;
        System.out.println("Item: " + name);
        System.out.println("Price: " + price + " x " + quantity);
        System.out.printf("Total cost: %.2f%n", total);
        input.close();
    }
}
