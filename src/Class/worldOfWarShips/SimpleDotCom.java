package Class.worldOfWarShips;

public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits;

    String checkYourself(String stringGuess)
    {
        int guees = Integer.parseInt(stringGuess);
        String result = "Мимо";

        for(int cell : locationCells)
        {
            if(guees==cell)
            {
                result="Попал";
                numOfHits++;
                break;
            }
        }
        if(numOfHits==locationCells.length)
        {
            result ="Потопил";
        }
        System.out.println(result);
        return result;
    }
    void setLocationCells(int[] locs){locationCells=locs;}
}
