package OOPS.Prctice.Inheritence.single;

public class MAIN {
    public static void main(String[] args) {
        C obj=new C();
        System.out.println(obj.x);
        System.out.println(obj.fun(90));
        obj.speed();

        // Implicit
        int x=90;
        double r=(double)x;
        //Explicit
        double a=90;
        int b=(int)a;
    }
}
