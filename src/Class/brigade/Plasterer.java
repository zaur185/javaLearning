package Class.brigade;

public class Plasterer extends Brigade {
    public String name;

        void setName(String setname)
        {
            if(setname!= null)
            {
                name=setname;
            }
        }
        String getName(){return name;}

    @Override
        public void worked() {
            System.out.println(name + "начинает штукатурить");
        }

}
