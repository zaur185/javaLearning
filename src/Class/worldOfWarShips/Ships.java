package Class.worldOfWarShips;

import java.util.ArrayList;

public class Ships {
    private ArrayList<String> locationCells;
    String nameShips;

    public void setLocationCells(ArrayList<String> newLocation) {

        locationCells = newLocation;
    }
    public void setNameShips(String n){
        nameShips=n;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("ВНИМАНИЕ потоплен корабль'"+nameShips+"'");
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
