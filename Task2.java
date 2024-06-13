import java.util.Random;
import java.util.Scanner;

class Task2{
  private final  static  int MIN_RANGE = 1 ;
   private final static int MAX_RANGE = 100 ;
   private final static int MAX_ATTEMPTS = 10 ;
   private final static int MAX_ROUNDS = 3 ;

    public static void main(String[] args) {
        Random r = new Random();
        Scanner S = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("It is a guessing game: ");
        System.out.println("Total rounds: 2");
        System.out.println("Maximum Attempts: 3");

        // continous loop of 2 rounds back to back

        for(int i =1 ; i<=MAX_ROUNDS; i++){
            int num = r.nextInt(MAX_RANGE) + MIN_RANGE;
            int attempts = 0;

            System.out.println("round " + i + "guess");

            while(attempts< MAX_ATTEMPTS){
                System.out.println("Enter the guess: ");
                int guess= S.nextInt();
                attempts++;

                if(guess==num) {
                    int score  = MAX_ATTEMPTS - attempts;
                    totalScore = totalScore + score;
                    System.out.printf( "Number guessed Correctly. Attempts = %d. Round score = %d \n" , attempts, score);
                    break;
                }
                else if (guess < num){
                    System.out.printf("the number is greater than %d. Attempts left = %d. \n" , guess , MAX_ATTEMPTS - attempts);
                }

                else if (guess > num){
                    System.out.printf("the number is less than %d. Attempts left = %d  \n" , guess , MAX_ATTEMPTS - attempts);
                }
            }

            if(attempts == MAX_ATTEMPTS){
                System.out.printf("\n Round = %d \n" , i);
                System.out.println("Attempts = 0");
                System.out.printf("The random number is: %d \n \n" , num);
            }
        }

        System.out.printf("Game Over. Total Score = %d \n ", totalScore);


    }
}
