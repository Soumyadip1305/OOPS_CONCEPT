package OOPS.Package.Access;

public class ObjectDemo {
    int num;
    float cgpa;

    public ObjectDemo(int num,float cgpa) {
        this.num=num;
        this.cgpa = cgpa;
    }

    public ObjectDemo(int num) {
        this.num=num;
    }

    @Override
    public String toString() {
        return "ObjectDemo{}";
    }

    @Override
    public int hashCode() {
        //return super.hashCode();
        return num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object obj) {
       // return super.equals(obj);
        return this.num==((ObjectDemo)obj).num
        && this.cgpa==((ObjectDemo)obj).cgpa;
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(30);
        ObjectDemo obj2=new ObjectDemo(30);
       // ObjectDemo obj2=obj;
      //  System.out.println(obj.hashCode());
      //  System.out.println(obj2.hashCode());

        ObjectDemo obj3=new ObjectDemo(12,83.6f);
        ObjectDemo obj4=new ObjectDemo(12,83.6f);
       // if (obj3==obj4){
        //    System.out.println("Obj3 equal to Obj4");
        //}
       // if (obj3.equals(obj4)){
         //   System.out.println("Obj3 equal to Obj4");
      //  }
       // System.out.println(obj.getClass());
        System.out.println(obj.getClass().getPackageName());
    }
}
