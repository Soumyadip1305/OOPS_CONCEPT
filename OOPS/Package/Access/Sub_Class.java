package OOPS.Package.Access;

public class Sub_Class extends A {

    public Sub_Class(int num, String name,float distance) {
        super(num, name,distance);
    }

    public static void main(String[] args) {
        Sub_Class obj=new Sub_Class(31,"Soumyadip",8.4f);

        // name is no modifier
        System.out.println(obj.name);

        // distance is protected modifier
        System.out.println(obj.distance);
        // num is private we can't access it other classes or subclasses
       // System.out.println(obj.num);
    }
}
class SubSub_Class extends Sub_Class{

    public SubSub_Class(int num, String name, float distance) {
        super(num, name, distance);
    }

    public static void main(String[] args) {
        SubSub_Class obj=new SubSub_Class(20,"Subhadip",6.56f);
        float a=obj.distance;
    }
}
class  Sub_Class2 extends A{

    public Sub_Class2(int num, String name, float distance) {
        super(num, name, distance);
    }

    public static void main(String[] args) {
        Sub_Class obj=new SubSub_Class(34,"Suraj",8.2f);
      //  int n=obj.num;
        System.out.println(obj instanceof Object);
    }
}
