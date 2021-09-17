package Class.worldOfWarShips;

import java.util.ArrayList;

public class MainWorldOfWarShips
{
    public static void main(String[] args)
    {
        /*
        // write your code here
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleShips theDotCom = new SimpleShips();

        int randomNum = (int) (Math.random() * 5);

        ArrayList<String> location = new ArrayList<>() ;
        location.add("2");
        location.add("3");
        location.add("4");

        theDotCom.setLocationCells(location);
        boolean isAlive = true;

        while (isAlive == true)
        {
            String guess =helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            System.out.println(result);
            numOfGuesses++;
            if(result.equals("Потопил"))
            {
                isAlive = false;
                System.out.println("Вам потребовалось "+numOfGuesses +"попыток(и).");
            }
        }
        */
        ShipsBust gameProcces = new ShipsBust();
        gameProcces.setUpGame();
        gameProcces.startPlaying();
    }
}
