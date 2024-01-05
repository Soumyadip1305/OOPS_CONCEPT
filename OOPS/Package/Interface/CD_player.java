package OOPS.Package.Interface;

public class CD_player implements Media{
    @Override
    public void start() {
        System.out.println("Music on");
    }

    @Override
    public void stop() {
        System.out.println("Music off");
    }
}
