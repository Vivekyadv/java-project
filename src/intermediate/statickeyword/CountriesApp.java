package intermediate.statickeyword;

public class CountriesApp {

    public static void main(String[] args) {
        System.out.println("Number of Countries: " + Country.getNumberOfCountries());
        Country brazil = new Country("Brazil", 210000000, "Brasilia");
        brazil.getDetails();
        Country germany = new Country("Germany", 83000000, "Berlin");
        germany.getDetails();
        Country japan = new Country("Japan", 125000000, "Tokyo");
        japan.getDetails();
        System.out.println("Number of Countries: " + Country.getNumberOfCountries());

    }
}
