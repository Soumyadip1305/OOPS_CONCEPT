package OOPS.Package.Singelton;

public class Singletons {
int num=200;
private Singletons() {

}
    private static Singletons instance;
    public static Singletons getinstance(){
        if (instance==null){
            instance=new Singletons();
        }
        return instance;
    }
}
