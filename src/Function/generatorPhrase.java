package Function;

public class generatorPhrase {
    void Generate()
    {
        String[] wordListOne ={"круглосуточный","трех-звенный","30000-футовый","взаимный","обоюдный выйгрыш","фронтэнд",
                "на основе веб-технологий","проникающий","умный","шесть сигм","метод критического пути","динамичный"};

        String[] wordListTwo ={"уполномоченый","трудный","чистый продукт","ориентированый","центральный",
                "распределенный","кластеризованыый","фирменный","нестандартный ум","позиционированный","сетевой",
                "сфокусированный","использованный с выгодой","выровненый","нацеленный на","общий","совместный"
                ,"ускоренный"};

        String[] wordListThree ={"процесс","пункт разгрузки","выход из положения","тип структуры","талант","подход",
                "уровень завоеванного внимания","портал ","период времени","обзор","образец","пункт следования"};

        int oneListLength = wordListOne.length;
        int twoListLength = wordListTwo.length;
        int threeListLength = wordListThree.length;

        int rand1 = (int)(Math.random()*oneListLength);
        int rand2 = (int)(Math.random()*twoListLength);
        int rand3 = (int)(Math.random()*threeListLength);

        String phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];

        System.out.println("Все,что нам нужно,- это " + phrase);

    }
}
