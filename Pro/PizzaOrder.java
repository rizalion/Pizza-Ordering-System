package Pro;

public class PizzaOrder {
    private static final int MAX_PIZZAS = 3;
    private Pizza[] pizzas;
    private int numPizzas;

    public PizzaOrder() {
        pizzas = new Pizza[MAX_PIZZAS];
        numPizzas = 0;
    }

    public void addPizza(Pizza pizza) {
        if (numPizzas < MAX_PIZZAS) {
            pizzas[numPizzas++] = pizza;
        } else {
            System.out.println("You've reached the maximum of " + MAX_PIZZAS + " pizzas per order.");
        }
    }

    public double calcTotal() {
        double totalCost = 0;
        for (int i = 0; i < numPizzas; i++) {
            totalCost += pizzas[i].calcCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza Order Summary:\n");
        for (int i = 0; i < numPizzas; i++) {
            sb.append("Pizza ").append(i + 1).append(": ")
              .append(pizzas[i].toString())
              .append(", Cost: PKR ").append(pizzas[i].calcCost())
              .append("\n");
        }
        sb.append("Total cost of all pizzas: PKR ").append(calcTotal());
        return sb.toString();
    }
}
