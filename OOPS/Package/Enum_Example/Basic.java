package OOPS.Package.Enum_Example;

public class Basic {
    enum Week implements A{
        sunday,monday,wednesday,tuesday,thursday,friday,saturday;
        // These are enum constants
        // public, static, final
        // since it final you can't create child enum
        // type is Week


        Week() {
            System.out.println("This day is "+this);
        }
        // This not public or protected
        // Only public or default
        // Why ? --> We don't want to create new objects
        // because this is not the enum concept

        // Internally it : public static final sunday=new week();
        @Override
        public void hello(){
            System.out.println("Hey how are you");
        }
    }

    public static void main(String[] args) {
        Week week=Week.sunday;
//        for (Week day:Week.values()) {
//            System.out.println(day);
//        }
//        System.out.println(week.ordinal());

        week.hello();
    }
}
