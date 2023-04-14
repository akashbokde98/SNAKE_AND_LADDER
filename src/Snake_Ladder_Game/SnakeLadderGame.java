package Snake_Ladder_Game;
import java.lang.Math;
import java.util.Random;

public class SnakeLadderGame
{
    public static void main(String[] args)
    {
        Random random = new Random();
        System.out.println("Welcome To Snake And Ladder Problem!");
        int firstPlayerPosition = 0;
        int secondPlayerPosition = 0;
        int winningPosition = 100;
        int numberOfDice = 0;
        //Player's Initial Position.
        System.out.println("Player1 At Position:" + firstPlayerPosition);
        System.out.println("Player2 At Position:" + secondPlayerPosition);
        // Loop Will Run till the Player Reaches the Winning Position 100.
        while (firstPlayerPosition < winningPosition && secondPlayerPosition < winningPosition)
        {

            // Player 1
            if (firstPlayerPosition >= 0)
            {
                System.out.println("------Player1-------");
                //Generating Random Numbers 1-6 By Rolling Dice.
                int diceRolls = (int)((Math.random() * 6) + 1);
                System.out.println("Dice Rolls:" + diceRolls);
                //Checking Option Whether Player Want to No Play,Ladder or Snake.
                switch (random.nextInt(3))
                {
                    case 1: //Case of Ladder.
                        int p1 = firstPlayerPosition + diceRolls;
                        //Condition To Get Exact Position.
                        if (p1 <= winningPosition)
                        {
                            firstPlayerPosition += diceRolls;
                            System.out.println("Ladder By:" + diceRolls);
                        }
                        System.out.println("Player1 At Position:" + firstPlayerPosition);//Checking Player's Current Position in Game.
                        System.out.println("--------------------");
                        numberOfDice++;
                        continue;

                    case 2: //Case of Snake.
                        firstPlayerPosition -= diceRolls;
                        System.out.println("Snake By:" + diceRolls);
                        System.out.println("Player1 At Position:" + firstPlayerPosition);//Checking Player's Current Position in Game.
                        System.out.println("--------------------");
                        numberOfDice++;
                        break;

                    default: //Case of No Play.
                        System.out.println("No Play!");
                        System.out.println("Player1 At Position:" + firstPlayerPosition);//Checking Player's Current Position in Game.
                        System.out.println("--------------------");
                }
               // continue;
            }
            else
            {
                //In Case Player Position Moves Below 0, then player restart from 0.
                firstPlayerPosition = 0;
                System.out.println("Restart From '0' Position");
            }

            // Player2
            if (secondPlayerPosition >= 0)
            {
                System.out.println("------Player2-------");
                //Generating Random Numbers 1-6 By Rolling Dice.
                int diceRolls = (int)((Math.random() * 6) + 1);
                System.out.println("Dice Rolls:" + diceRolls);
                //Checking Option Whether Player Want to No Play,Ladder or Snake.
                switch (random.nextInt(3))
                {
                    case 1: //Case of Ladder.
                        int p2 = secondPlayerPosition + diceRolls;
                        //Condition To Get Exact Position.
                        if (p2 <= winningPosition)
                        {
                            secondPlayerPosition += diceRolls;
                            System.out.println("Ladder By:" + diceRolls);
                        }
                        System.out.println("Player2 At Position:" + secondPlayerPosition);//Printing Player2 Current Position After Getting Ladder.
                        System.out.println("--------------------");
                        numberOfDice++;
                        continue;

                    case 2: //Case of Snake.
                        secondPlayerPosition -= diceRolls;
                        System.out.println("Snake By:" + diceRolls);
                        System.out.println("Player2 At Position:" + secondPlayerPosition);//Printing Player2 Current Position After Getting Snake Bite.
                        System.out.println("--------------------");
                        numberOfDice++;
                        break;

                    default: //Case of No Play.
                        System.out.println("No Play!");
                        System.out.println("Player2 At Position:" + secondPlayerPosition);//Printing Player2 Current Position After Choosing No Play Option.
                        System.out.println("--------------------");
                }
                //continue;
            }
            else
            {
                //In Case Player Position Moves Below 0, then player restart from 0.
                secondPlayerPosition = 0;
                System.out.println("Restart From '0' Position");
            }
        }
        //Checking Which Player Come First To Winning Position.
        if (firstPlayerPosition == winningPosition)
        {
            System.out.println("Player1 At Winning Position:" + firstPlayerPosition);
        }
        else
        {
            System.out.println("Player2 At Winning Position:" + secondPlayerPosition);
        }

        System.out.println("Number of Times the Dice Was Played is:" + numberOfDice);
    }
}

