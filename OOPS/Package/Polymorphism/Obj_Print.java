package OOPS.Package.Polymorphism;

public class Obj_Print {
    int number;

    @Override
    public String toString() {
        return "Obj_Print{" +
                "number=" + number +
                '}';
    }

    public Obj_Print(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Obj_Print obj=new Obj_Print(90);
        System.out.println(obj);
    }
}
