package beginner;

import java.util.Calendar;

public class IMDBApp {
    public static void main(String[] args) {
        String actorName = "Tom Cruise";
        int yearOfBorn = 1962;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age = year - yearOfBorn;

        String[] movieTitles = {
                "Minority Report", "Top Gun",
                "Rain Man", "Cocktail", "The Mummy"
        };

        float[] movieRatings = {
                7.6F, 6.9F,
                8.0F, 5.9F, 5.4F
        };

        System.out.println("Actor's Name: " + actorName);
        System.out.println("Born: " + yearOfBorn + " (" + age + " years old)");
        System.out.println();
        System.out.println("Movies:");

        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println(movieTitles[i] + " - " + getRating(movieRatings[i]));
        }
    }

    static String getRating(float rating){
        if (rating <= 5.0){
            return "bad";
        } else if (rating > 5.0 && rating <= 6.5){
            return "average";
        } else if (rating > 6.5 && rating <= 7.0){
            return "good";
        } else if (rating > 7.0 && rating <= 8.0){
            return "very good";
        }else{
            return "amazing";
        }
    }
}
