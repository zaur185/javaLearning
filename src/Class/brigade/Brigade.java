package Class.brigade;

public class Brigade {
    private int numBrigade;
        void setNumBrigade(int setnum)
        {
            if(setnum>0)
            {
                numBrigade=setnum;
            }
        }
        int getNumBrigade(){return numBrigade;};

        void worked() {
            System.out.println("работать");
        }
}


