import java.util.Scanner;

public class guessingNumbers
	{
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);

				System.out.println("What's your name?");
				String name = userInput.nextLine();
				boolean playAgain = true;
				while (playAgain)
					{
						System.out.println("Please choose a difficulty between 1 and 3 (3 is the hardest)");
						int diff = 0;
						int difficultyChoice = userInput.nextInt();

						if (difficultyChoice == 1)
							{
								diff = 5;
							} else if (difficultyChoice == 2)
							{
								diff = 20;
							} else
							{
								diff = 100;
							}

						int secretNumber = (int) (Math.random() * diff) + 1;

						int guessCounter = 0;
						
						System.out.println("Hello " + name + " please guess a number betwen 1 and " + diff);
						boolean guessing = true;
						while (guessing)
							{
								System.out.println("What is your guess?");
								int guess = userInput.nextInt();

								if (guess > secretNumber)
									{
										System.out.println("Too high");
									} else if (guess < secretNumber)
									{
										System.out.println("Too low");

									} else
									{
										System.out.println("Correct!!!");
										guessing = false;
									}
								guessCounter ++;

							}
						if (guessCounter == 1){
							System.out.println("Congrats, you took " + guessCounter + " guess, would you like to play again? 1 = yes, 2 = no");
						}
						else {
							System.out.println("Congrats, you took " + guessCounter + " guesses, would you like to play again? 1 = yes, 2 = no");
						}
						int answer = userInput.nextInt();
						if (answer == 2)
							{
								System.out.println("Cool Cool, have a nice day");
								playAgain = false;

							}

					}
			}
	}
			
					
	
			
			
		

	
