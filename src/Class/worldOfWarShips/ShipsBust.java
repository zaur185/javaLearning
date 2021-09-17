package Class.worldOfWarShips;

import java.util.ArrayList;

public class ShipsBust {
    private ArrayList<Ships> shipList = new ArrayList<>();
    private GameHelper gameHelper = new GameHelper();
    private int numOfGuess = 0;


    void setUpGame() {
        //создание кораблей и присваевание им имен
        Ships ship1 = new Ships();
        ship1.nameShips = "Севастополь";
        Ships ship2 = new Ships();
        ship2.nameShips = "Петропавлоск";
        Ships ship3 = new Ships();
        ship3.nameShips = "Слава";
        //добавление кораблей в ArrayList
        shipList.add(ship1);
        shipList.add(ship2);
        shipList.add(ship3);

        System.out.println("Ваша цель - потопить три 'корабля'");
        System.out.println("Севастополь,Петропавлоск,Слава");
        System.out.println("Попытайтесь потопить их за минимальное количетсво ходов.");

        for (Ships shipsToSet : shipList) {

            ArrayList<String> newLocation = gameHelper.placeShips(3);

            shipsToSet.setLocationCells(newLocation);
        }


    }

    public void startPlaying() {
        while (!shipList.isEmpty()) {

            String userGuess = gameHelper.getUserInput("Сделайте ход");

            checkUserGuess(userGuess);
        }
        finishGame();

    }

    private void checkUserGuess(String userGuess) {
        numOfGuess++;
        String result = "Мимо";
        for (Ships shipsToTest : shipList) {
            result = shipsToTest.checkYourself(userGuess);
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                shipList.remove(shipsToTest);
                break;
            }

        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все'корабли'ушли ко дну!");
        if (numOfGuess <= 18) {
            System.out.println("Это заняло у вас всего " + numOfGuess + "попыток");
            System.out.println("Вы успели выбраться до того как ваш корабль утонул");

        } else {
            System.out.println("Это заняло у вас довольно много времени." + numOfGuess+"попыток");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений");
        }
    }


}
