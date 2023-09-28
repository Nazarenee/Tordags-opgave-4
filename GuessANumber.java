import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
		Scanner scanner = new Scanner(System.in);	 

       if (scanner.hasNextDouble()) {
        double input = scanner.nextDouble();


         if (input >= Integer.MIN_VALUE && input <= Integer.MAX_VALUE){ 
         int guess = (int) input;

      if (guess == rnd_number){
            System.out.println("Congratulations you both thought of the same number : " + rnd_number);
   } else if (guess < rnd_number){
           System.out.println("Your number is lower than the number im thinking off, try again!");
           makeAGuess();
       } else if (guess > rnd_number){
           System.out.println("your number is higher than the number in thinking off, try again!");
           makeAGuess();
           } 


  } else {
    System.out.println("You have picked a number that's not numeric. Your number has to be between " + Integer.MIN_VALUE + " and  " + Integer.MAX_VALUE);
    makeAGuess();
  }
}


scanner.close();
      

    }


}




