package OOPS.Package.AbstractDemo;

 public abstract class parent {
     int age;

     public parent(int age) {
         this.age = age;
     }
     static void hello(){
         System.out.println("Hey");
     }
     abstract void career();
    abstract void partner();
}
