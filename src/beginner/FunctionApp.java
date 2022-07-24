package beginner;

public class FunctionApp {
    public static void main(String[] args) {
        sayHello();
        blackboardPunishment(3);
        System.out.println();

        System.out.println("The price with 10% off: " + getTenPercentOffDiscountPrice(20000));
        System.out.println("The price with 35% off: " + getDiscountPrice(15000, 35));
        System.out.println("The price with 40% off: " + getDiscountPrice(50000.75, 40));
        System.out.println();

        System.out.println(getEnergyEfficiency('B') + "\n");
        getCarDescription("Tesla Roadster", 2018, "good");

    }

    static void sayHello() {
        System.out.println("Hello!!");
    }

    static void blackboardPunishment(int repeatNumber) {
        for (int i = 1; i < repeatNumber; i++) {
            System.out.println("BEING RIGHT SUCKS!");
        }
    }

    static double getTenPercentOffDiscountPrice(int price){
        return price * 0.9;
    }

    static double getDiscountPrice(int price, int percent){
        return price * percent / 100.0;
    }

    static double getDiscountPrice(double price, int percent){
        return price * percent / 100;
    }

    static String getEnergyEfficiency(char category){
        category = Character.toUpperCase(category);
        switch (category) {
            case 'A':
                return "Very low energy consumption";
            case 'B':
                return "Low energy consumption";
            case 'C':
                return "Normal energy consumption";
            case 'D':
                return "Above normal energy consumption";
            case 'E':
                return "High energy consumption";
            case 'F':
                return "Very high energy consumption";
            case 'G':
                return "Extremely High energy consumption";
            default:
                return "Not defined category";
        }
    }

    static void getCarDescription(String model, int productionYear, String condition){
        System.out.println("This car is a " + model);
        System.out.println("Production year: " + productionYear);
        System.out.println("It is in " + condition + " condition");
    }

}
