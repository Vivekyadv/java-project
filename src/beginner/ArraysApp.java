package beginner;

public class ArraysApp {
    public static void main(String[] args) {
        int[] lotteryNumbers = new int[5];

        lotteryNumbers[0] = 29;
        lotteryNumbers[1] = 42;
        lotteryNumbers[2] = 12;
        lotteryNumbers[3] = 47;
        lotteryNumbers[4] = 51;

        for (int i = 0; i < lotteryNumbers.length; i++) {
            System.out.print(lotteryNumbers[i] + " ");
        }

        int[][] weeklyLotteryNumbers = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
                {13, 24, 35, 46, 57},
                {10, 23, 35, 48, 58}
        };

        System.out.println();
        System.out.println();
        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                System.out.print(weeklyLotteryNumbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
