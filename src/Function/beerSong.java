package Function;

public class beerSong {
    public void Song()
    {
        int beerNum=99;
        String word=("бутылок (бутолки)");

        while(beerNum>0)
        {
            if(beerNum==1)
            {
                word="бутылка";
            }
            System.out.println(beerNum+" "+ word + "пива на стене");
            System.out.println(beerNum+" "+ word + "пива. ");
            System.out.print("Возми одну");
            System.out.println(",пусти по кругу");
            beerNum =beerNum-1;
            if(beerNum==0)
            {
                System.out.println("Нет бутылок на стене");
            }
        }
    }

}
