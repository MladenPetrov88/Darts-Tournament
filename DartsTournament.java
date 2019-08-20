import java.util.Scanner;

public class DartsTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startingPoints = Integer.parseInt(scan.nextLine());
        int shotsCounter = 0;
        boolean wonWithBullseye = false;

        while (startingPoints > 0) {
            String sector = scan.nextLine();
            shotsCounter++;
            if ("bullseye".equals(sector)) {
                wonWithBullseye = true;
                break;
            }
            int points = Integer.parseInt(scan.nextLine());

            if ("number section".equals(sector)) {
                startingPoints -= points;
            } else if ("double ring".equals(sector)) {
                startingPoints -= (points * 2);
            } else if ("triple ring".equals(sector)) {
                startingPoints -= (points * 3);
            }

            if (startingPoints < 0) {
                break;
            }
        }

        if (wonWithBullseye) {
            System.out.println(String.format("Congratulations! You won the game with a bullseye in %d moves!", shotsCounter));
        } else if (startingPoints == 0) {
            System.out.println(String.format("Congratulations! You won the game in %d moves!", shotsCounter));
        } else {
            System.out.println(String.format("Sorry, you lost. Score difference: %d.", Math.abs(startingPoints)));
        }
    }
}
