package beginner;

public class LoopsApp {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 5){
            System.out.println(i + ". Noticed You've Copied My Beard!");
            i ++;
        }
        System.out.println("Value of i: " + i);
        System.out.println();

        int j = 1;
        do {
            System.out.println(j + ". I am Groot!!");
            j ++;
        } while (j <= 5);

        System.out.println("Value of j: " + j);
        System.out.println();

        for(int k = 1; k <= 8; k++){
            if (k == 3) {
                continue;
            }
            if (k == 6) {
                break;
            }
            System.out.println(k + ". I am Steve Rogers!!");
        }

        System.out.println();

        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= 2; l++) {
                System.out.println("k=" + k + " l=" + l + " Meet Friend of mine, Tree!");
            }
        }

    }
}
