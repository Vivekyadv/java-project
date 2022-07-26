package advanced.objectsuperclass.objectequals;

public class PizzaApp {

    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException {
        System.out.println("Available sizes:");
        for (PizzaSize pizzaSize : PizzaSize.values()) {
            System.out.println("- " + pizzaSize.getPizzaSizeText());
        }
        System.out.println();

        Pizza pizzaOrder = new Pizza("Margareta", PizzaSize.MEDIUM);
        System.out.println("I ordered the following pizza:");
        System.out.println("Name: " + pizzaOrder.getName());
        System.out.println("Size: " + pizzaOrder.getPizzaSize().getPizzaSizeText());
        System.out.println("Price: $" + pizzaOrder.getPrice());

        Pizza samePizza = (Pizza) pizzaOrder.clone();
        System.out.println("I ordered another pizza:");
        System.out.println("Name: " + samePizza.getName());
        System.out.println("Size: " + samePizza.getPizzaSize().getPizzaSizeText());
        System.out.println("Price: $" + samePizza.getPrice());

        System.out.println(pizzaOrder.equals(samePizza));
        /* The above statement will return false even though all values are same. To make it work properly,
        we have to override the equals() function in Pizza Class. */

        /* After overriding the equals() function in Pizza */
        Pizza anotherPizza = new Pizza("Margareta", PizzaSize.SMALL);
        System.out.println(pizzaOrder.equals(anotherPizza));

    }
}