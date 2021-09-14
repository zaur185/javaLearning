package Class.gameLauncher;

public class Player {
    private int number;

    void setNumber(int setnum)
    {
        if(setnum>0)
        {
            number=setnum;
        }
    }
    int getNumber(){return number;};

    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("Думаю,это число " + number);
    }

}
