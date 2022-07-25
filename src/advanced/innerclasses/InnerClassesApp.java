package advanced.innerclasses;

import advanced.enumcoding.PizzaSize;

public class InnerClassesApp {

    private static boolean isPizzaReady(int waitedInMinutes){
        class Oven{
            public boolean isPizzaBakedProperly(){
                if (waitedInMinutes > 30) {
                    return true;
                }
                return false;
            }
        }

        Oven oven = new Oven();
        return oven.isPizzaBakedProperly();
    }

    public static void main(String[] args) {
        Pizza firstPizza = new Pizza("Margherita", PizzaSize.MEDIUM);
        System.out.println("Name: " + firstPizza.getName());
        Pizza secondPizza = new Pizza("Margherita", PizzaSize.MEDIUM){
            @Override
            public String getName() {
                return "Anonymous";
            }
        };
        System.out.println("Name: " + secondPizza.getName());

        if (isPizzaReady(40)){
            System.out.println("The pizza is ready.");
        } else {
            System.out.println("The pizza is not ready");
        }

        Pizza thirdPizza = new Pizza("Pizza Cake", PizzaSize.LARGE);
        Pizza.PizzaSlice pizzaSlice = secondPizza.cutPizzaSlice();
        System.out.println(pizzaSlice.calculatePizzaSliceArea());

    }
}
