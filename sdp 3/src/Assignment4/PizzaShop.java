package Assignment4;

public class PizzaShop {
    public static void main(String[] args) {

        Pizza pizza = new MargheritaPizza();

        pizza = new CheeseTopping(pizza);
        pizza = new MushroomTopping(pizza);
        pizza = new PepperoniTopping(pizza);


        System.out.println("Order: " + pizza.getDescription());
        System.out.println("Total cost: $" + pizza.getCost());
    }
}
