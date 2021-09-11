package Class.brigade;

public class decorator extends brigade {
        public String name;

        @Override
        public void worked() {
            System.out.println(name + "начинает красить");
        }
}
