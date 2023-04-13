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
        int dieRolls = (int)((Math.random() * 6) + 1); //Generating Random Numbers 0-6.
        //Checking Option Whether Player Want to No Play,Ladder or Snake.
        switch (random.nextInt(3))
        {
            case 1: //Case of Ladder.
                playerPosition += dieRolls;
                break;

            case 2: //Case of Snake.
                playerPosition -= dieRolls;
                break;

            default: //Case of No Play.
                System.out.println("No Play!");
        }
    }
}

