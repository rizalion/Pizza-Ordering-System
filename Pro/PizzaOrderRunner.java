package Pro;

import java.util.Scanner;

public class PizzaOrderRunner {
    private static final int MAX_PIZZAS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzaOrder order = new PizzaOrder();
        String choice;

        System.out.println("🍕 Welcome to the Pizza Ordering System!");

        do {
            if (orderReachedMax(order)) {
                System.out.println("You've reached the maximum of " + MAX_PIZZAS + " pizzas per order.");
                break;
            }

            System.out.println("\nEnter pizza details:");
            System.out.print("Size (Small/Medium/Large) [case sensitive]: ");
            String size = scanner.next();

            System.out.print("Number of cheese toppings: ");
            int cheese = scanner.nextInt();

            System.out.print("Number of pepperoni toppings: ");
            int pepperoni = scanner.nextInt();

            System.out.print("Number of ham toppings: ");
            int ham = scanner.nextInt();

            Pizza pizza = new Pizza(size, cheese, pepperoni, ham);
            order.addPizza(pizza);

            System.out.println("\n📝 Description of Pizza:");
            System.out.println(pizza.getDescription());
            System.out.println("💵 Cost of Pizza: PKR " + pizza.calcCost());

            if (orderReachedMax(order)) {
                System.out.println("\nYou've reached the maximum of " + MAX_PIZZAS + " pizzas per order.");
                break;
            }

            System.out.print("\nDo you want to add another pizza? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\n✅ Final Order Summary:");
        System.out.println(order);

        System.out.println("\n🙏 Thank you for your order!");
        scanner.close();
    }

    // Helper to check if max pizzas reached
    private static boolean orderReachedMax(PizzaOrder order) {
        // Reflection of internal pizza count
        return order.toString().split("Pizza ").length - 1 >= MAX_PIZZAS;
    }
}
