package Class.brigade;

public class plasterer extends brigade {
        public String name;

        @Override
        public void worked() {
            System.out.println(name + "начинает штукатурить");
        }

}
