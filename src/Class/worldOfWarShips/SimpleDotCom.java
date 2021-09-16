package Class.worldOfWarShips;
import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationCells;
    //private int numOfHits;

    String checkYourself(String userInput)
    {
        String result = "Мимо";

        int index = locationCells.indexOf(userInput);

        if(index >=0)
        {
            locationCells.remove(index);

            if(locationCells.isEmpty())
            {
                result="Потопил";
            }
            else
            {
                result= "Попал";
            }
        }
        return result;
    }
    void setLocationCells(ArrayList<String> locs)
    {
        locationCells=locs;
    }
}
