import java.util.Scanner;

class RandomGuessingGame {

    int random;

    RandomGuessingGame(){
        random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     *
     * @param guessNumber the number that player guess
     * @return
     * - negative if the guess number is smaller
     * - 0 if the number is correct
     * - positive if the guess number is greater
     */
    int guess(int guessNumber){
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RandomGuessingGame game = new RandomGuessingGame();

        System.out.println("Welcome to the Guessing Game");
        System.out.println("Guess the number between 1 to 100");

        int guess;
        int result;

        do {
            System.out.print("Guess the number : ");
            guess = input.nextInt();
            result = game.guess(guess);

            if (result == 0){
                System.out.println("Congrats, your guess is correct");
            } else if (result < 0) {
                System.out.println("Please guess higher");
            } else {
                System.out.println("Please guess lower");
            }
        }while (result != 0);
    }
}
