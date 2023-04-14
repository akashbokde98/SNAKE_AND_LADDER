package Snake_Ladder_Game;
import java.lang.Math;
import java.util.Random;

public class SnakeLadderGame
{
    public static void main(String[] args)
    {
        Random random = new Random();
        System.out.println("Welcome To Snake And Ladder Problem!");
        int playerPosition = 0;
        int winningPosition = 100;
        int numberOfDice = 0;

        System.out.println("Player At Position:" + playerPosition);
        // Loop Will Run till the Player Reaches the Winning Position 100.
        while (playerPosition < winningPosition )
        {
            if (playerPosition >= 0)
            {
                //Generating Random Numbers 1-6 By Rolling Dice.
                int diceRolls = (int)((Math.random() * 6) + 1);
                System.out.println("Dice Rolls:" + diceRolls);
                //Checking Option Whether Player Want to No Play,Ladder or Snake.
                switch (random.nextInt(3))
                {
                    case 1: //Case of Ladder.
                        int x = playerPosition + diceRolls;
                        //Condition To Get Exact Position.
                        if (x <= winningPosition)
                        {
                            playerPosition += diceRolls;
                            System.out.println("Ladder By:" + diceRolls);
                        }
                        System.out.println("Player At Position:" + playerPosition);//Checking Player's Current Position in Game.
                        System.out.println("--------------------");
                        numberOfDice++;
                        break;

                    case 2: //Case of Snake.
                        playerPosition -= diceRolls;
                        System.out.println("Snake By:" + diceRolls);
                        System.out.println("Player At Position:" + playerPosition);//Checking Player's Current Position in Game.
                        System.out.println("--------------------");
                        numberOfDice++;
                        break;

                    default: //Case of No Play.
                        System.out.println("No Play!");
                        System.out.println("Player At Position:" + playerPosition);//Checking Player's Current Position in Game.
                        System.out.println("--------------------");
                }
            }
            else
            {
                //In Case Player Position Moves Below 0, then player restart from 0.
                playerPosition = 0;
                System.out.println("Restart From '0' Position");
            }
        }
        System.out.println("Player At Winning Position:" + playerPosition);
        System.out.println("Number of Times the Dice Was Played is:" + numberOfDice);
    }
}

