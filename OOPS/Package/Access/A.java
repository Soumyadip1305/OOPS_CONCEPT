package OOPS.Package.Access;

public class A {
   private int num;
    String name;
    public int[]arr;
    protected float distance;

    public int getNum() {
        return num;
    }

    public void setNum(int  num) {
        this.num = num;
    }

    public A(int num, String name,float distance) {
        this.num = num;
        this.name=name;
        this.arr=new int[num];
        this.distance = distance;
    }

    public A(int num, String name) {
        this.num = num;
        this.name=name;
        this.arr=new int[num];
    }
}
