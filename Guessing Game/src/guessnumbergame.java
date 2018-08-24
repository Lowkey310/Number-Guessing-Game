import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;
public class guessnumbergame
	{
		static String name = "";
		public static void main(String[] args)
			{
				
				welcomeThePlayer();
				playChoseLevelAndPlayGuessingGame();
				askPlayerToPlayAgain();
				
			}

		    

			private static void welcomeThePlayer()
				{
					System.out.println("Welcome! What is your name?");
					Scanner userInput = new Scanner(System.in);
				    name = userInput.nextLine();
					
				}


		    private static void playChoseLevelAndPlayGuessingGame()
				{
					
					        System.out.println("What's up " + name + "!");
							System.out.println("Let's play a GUESSING GAME! Feel exciting? ");
							System.out.println("Now, select a difficulty! Your choices are 1.eaaasy, 2.haaard, 3.craaazy hard! Remember to type in the number infront of your choice");
							Scanner userInput2 = new Scanner(System.in);
							int difficulty = userInput2.nextInt();
							
							int number = 0;
							if (difficulty == 1)
								{
									System.out.println("Cool!");
									System.out.println("Let's guess the secret number between 0 to 18!");
									number = 18;
								}
							
							else if (difficulty == 2)
								{
									System.out.println("Awesome!");
									System.out.println("Let's guess the secret number between 0 to 57!");
									number = 57;
								}
							else if (difficulty == 3)
								{
									System.out.println("OK, I respect you!");
									System.out.println("Let's guess the secret number between 0 to 101!");
									number = 101;
								}
							
							
							int secretnumber = (int)(Math.random()* number );
							int counter = 0;
							
							boolean answer = true;
							while (answer)
								{
									Scanner userInput1 = new Scanner(System.in);
									int guess= userInput1.nextInt();
									if (guess < secretnumber)
										{
											System.out.println("Sorry, your number is too low this time."
													+ " Guess again please");
										    counter++;
										}
									if (guess > secretnumber)
										{
											System.out.println("Sorry, your number is too high this time."
													+ " Guess again please");
											counter++;
										}
									if (guess == secretnumber)
										{
											counter++;
											System.out.println("Wow! Congrats! You know what I'm thinking!");
											answer = false;
											if (counter == 1)
												{
													System.out.println("It only tooks you " + counter + " try! You are a Genius!");
												}
											else
												{
													System.out.println("It tooks you " + counter + " tries! Good Job!");
												}
										}
								}
							
			
						
					
				}
		    private static void askPlayerToPlayAgain()
				{
					System.out.println("Well, Do you want to play again? 1. Yea Sure Let's keep going! 2. Nope I'm outta here. Remember to type in the number infront of your choice");
					Scanner userInput3 = new Scanner(System.in);
					int answerafterward = userInput3.nextInt();
					if (answerafterward == 1 )
						{
							System.out.println("Welcome Back! I miss you already!");
							playChoseLevelAndPlayGuessingGame();
							askPlayerToPlayAgain();
							
						}
					else
						{
							System.out.println("Alright, see you soon T^T");
						}
					
				}
	}
