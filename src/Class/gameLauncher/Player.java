package Class.gameLauncher;

public class Player {
    int number;
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("Думаю,это число " + number);
    }

}
