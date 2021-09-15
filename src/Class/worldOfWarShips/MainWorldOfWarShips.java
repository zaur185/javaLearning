package Class.worldOfWarShips;

public class MainWorldOfWarShips
{
    public static void main(String[] args)
    {
        // write your code here
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);

        int[] location = {randomNum, randomNum+1, randomNum+2};

        theDotCom.setLocationCells(location);
        boolean isAlive = true;

        while (isAlive == true)
        {
            String guess =helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("Потопил"))
            {
                isAlive = false;
                System.out.println("Вам потребовалось "+numOfGuesses +"попыток(и).");
            }
        }
    }
}
