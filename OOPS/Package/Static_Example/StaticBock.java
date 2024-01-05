package OOPS.Package.Static_Example;

public class StaticBock {
        static int a=2;
        static int b;
        static {
            System.out.println("Hello I am soumyadip saha");
            b=a*5;
        }

    public static void main(String[] args) {
        StaticBock ob=new StaticBock();
        System.out.println(StaticBock.a+" & "+StaticBock.b);
        StaticBock.b*=3;
        StaticBock ob2=new StaticBock();
        System.out.println(ob2.a+" & "+ob2.b);
    }
}
