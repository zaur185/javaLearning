package Class.brigade;

public class Decorator extends Brigade {
        public String name;

        @Override
        public void worked() {
            System.out.println(name + "начинает красить");
        }
}
