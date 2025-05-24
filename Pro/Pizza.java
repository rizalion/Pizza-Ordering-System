package Pro;

public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public double calcCost() {
        double cost = 0;
        switch (size) {
            case "Small":
                cost = 500 + (2 * (cheeseToppings + pepperoniToppings + hamToppings));
                break;
            case "Medium":
                cost = 1200 + (20 * (cheeseToppings + pepperoniToppings + hamToppings));
                break;
            case "Large":
                cost = 1400 + (200 * (cheeseToppings + pepperoniToppings + hamToppings));
                break;
            default:
                System.out.println("Invalid size. Cost calculation failed.");
                break;
        }
        return cost;
    }

    public String getDescription() {
        return "Pizza size: " + size + ", Cheese toppings: " + cheeseToppings +
               ", Pepperoni toppings: " + pepperoniToppings + ", Ham toppings: " + hamToppings;
    }
}
