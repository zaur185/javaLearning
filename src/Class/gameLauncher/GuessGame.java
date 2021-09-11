package Class.gameLauncher;

public class GuessGame extends Player {
    Player p1;
    Player p2;
    Player p3;

    public void startGame()
    {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guesssp1 = 0;
        int guesssp2 = 0;
        int guesssp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber;

        while (true)
        {
            targetNumber = (int) (Math.random() * 10);
            System.out.println("Я загадываю число от 0 до 9...");
            System.out.println("Число которое нужно угадать, - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guesssp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guesssp1);

            guesssp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guesssp2);

            guesssp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guesssp3);

            if (guesssp1 == targetNumber)
            {
                p1isRight = true;
            }
            if (guesssp2 == targetNumber)
            {
                p2isRight = true;
            }
            if (guesssp3 == targetNumber)
            {
                p3isRight = true;
            }

            if(p1isRight || p2isRight || p3isRight)
            {
                System.out.println("У на есть победитель!");
                System.out.println("Первый игрок угадал? " + p1isRight);
                System.out.println("Второй игрок угадал? " + p2isRight);
                System.out.println("Трейти игрок угадал? " + p3isRight);
                System.out.println("Конец игры");
                break;
            }
            else{System.out.println("Никто не угадал,попройте еще раз");}
        }
    }






}
