package OOPS.Package.Static_Example;

//import jdk.incubator.vector.VectorOperators;

public class Test {
    public static void main(String[] args) {
        Human Soumya=new Human("Soumyadip Saha",20,60000,false);
        Human Trisha=new Human("Trisha Ghosh",19,40000,false);
        Human subha=new Human("Subhadip Roy",23,50000,false);
        System.out.println(Trisha.name);
        System.out.println("The population is "+Human.population);
        fun();
    }

    static void fun(){
        //greeting();
        Test ob=new Test();
        ob.greeting();
    }
    void greeting(){
        System.out.println("I am ok now");
    }
}
