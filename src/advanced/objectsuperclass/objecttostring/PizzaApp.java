package advanced.objectsuperclass.objecttostring;

public class PizzaApp {

    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException {
        System.out.println("Available sizes:");
        for (PizzaSize pizzaSize : PizzaSize.values()) {
            System.out.println("- " + pizzaSize.getPizzaSizeText());
        }

        System.out.println("---------------------------------");
        Pizza pizzaOrder = new Pizza("Margareta", PizzaSize.MEDIUM);
        System.out.println("I ordered the following pizza:");
        System.out.println("Name: " + pizzaOrder.getName());
        System.out.println("Size: " + pizzaOrder.getPizzaSize().getPizzaSizeText());
        System.out.println("Price: $" + pizzaOrder.getPrice());

        System.out.println("---------------------------------");
        Pizza samePizza = (Pizza) pizzaOrder.clone();
        System.out.println("I ordered another pizza:");
        System.out.println("Name: " + samePizza.getName());
        System.out.println("Size: " + samePizza.getPizzaSize().getPizzaSizeText());
        System.out.println("Price: $" + samePizza.getPrice());

        Pizza anotherPizza = new Pizza("Margareta", PizzaSize.LARGE);
//        System.out.println(pizzaOrder.equals(anotherPizza));

        System.out.println("---------------------------------");
        System.out.println("pizzaOrder's hashcode: " + pizzaOrder.hashCode());
        System.out.println("samePizza's hashcode: " + samePizza.hashCode());
        System.out.println("anotherPizza's hashcode: " + anotherPizza.hashCode());

        System.out.println("---------------------------------");
        System.out.println("Using toString() method:");
        System.out.println(pizzaOrder);
     /* By default, if we just println() object uses toString() So no need to call toString(). And it'll return
        the address of object in hash form. output: advanced.objectsuperclass.objecttostring.Pizza@db385832
        After overriding the toString() in Pizza class.    */

    }
}
