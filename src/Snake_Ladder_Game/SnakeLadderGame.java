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
        // Loop Will Rum till the Player Reaches the Winning Position 100.
        while (playerPosition < winningPosition )
        {
            if (playerPosition >= 0)
            {
                //Generating Random Numbers 1-6.
                int dieRolls = (int)((Math.random() * 6) + 1);
                //Checking Option Whether Player Want to No Play,Ladder or Snake.
                switch (random.nextInt(3))
                {
                    case 1: //Case of Ladder.
                        int x = playerPosition + dieRolls;
                        //Condition To Get Exact Position.
                        if (x <= winningPosition)
                        {
                            playerPosition += dieRolls;
                            System.out.println("Ladder:" + playerPosition);
                        }
                        break;

                    case 2: //Case of Snake.
                        playerPosition -= dieRolls;
                        //if (playerPosition >= 0)
                        System.out.println("Snake:" + playerPosition);
                        break;

                    default: //Case of No Play.
                        System.out.println("No Play!");
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
    }
}

