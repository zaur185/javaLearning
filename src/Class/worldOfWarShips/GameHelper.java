package Class.worldOfWarShips;

import java.io.*;
import java.util.*;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int shipCount = 0;


    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader
                    (System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase(Locale.ROOT);
    }

    public ArrayList<String> placeShips(int shipSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();

        String[] alphacoorse = new String[shipSize];    //координаты типа f6
        String temp = null;                             //временная строка конкатенации
        int[] coords = new int[shipSize];               //координаты текущего корабля
        int attempts = 0;                               //счетчик текущий попыпок
        boolean success = false;                        //Нашли подходящее местоположение?
        int location = 0;                               //Текущее начальное местоположение

        shipCount++;                                    //Энный корабль для размещения
        int incr = 1;                                   //устанавливается горизонтальный инкримент
        if ((shipCount % 2) == 1) {                     //Если нечетный(размещаем вертикально
            incr = gridLength;                          //устанавливается вертикальный инкримент
        }

        while (!success & attempts++ < 200) {           //главный поисковый цикл
            location = (int) (Math.random() * gridSize);//получаем случайную стартовую строку
            int x = 0;                                  //Энная позиция в
            success = true;                             //предпологаем успешный исход
            while (success && x < shipSize) {           //Ищем соседнюю неиспользованную ячейку
                if (grid[location] == 0) {              //Если еще не используется
                    coords[x++] = location;             // Сохраняем местоположение
                    location += incr;                   //Пробуем следующую соседнюю ячейку
                    if (location >= gridSize) {         //Вышли за рамки-низ
                        success = false;                //Неудача
                    }
                    if (x > 0 && (location % gridLength == 0)) { //Вышли за рамки - правый край
                        success = false;                // Неудача
                    }
                } else {                                //если местоположение уже используется
                    success = false;                    //неудача
                }
            }
        }
        int x = 0;                                      // Переводим местоположение в символьные коорд
        int row = 0;                                    //значение строки
        int column = 0;                                 //числовое значение столбца
        while (x < shipSize) {
            grid[coords[x]] = 1;                        //
            row = (int) (coords[x] / gridLength);
            column = coords[x] % gridLength;
            temp = String.valueOf(alphabet.charAt(column));

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;

        }
        return alphaCells;
    }
}
