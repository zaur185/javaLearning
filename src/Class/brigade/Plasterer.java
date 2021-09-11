package Class.brigade;

public class Plasterer extends Brigade {
        public String name;

        @Override
        public void worked() {
            System.out.println(name + "начинает штукатурить");
        }

}
