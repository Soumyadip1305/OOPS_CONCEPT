package OOPS.Package.Polymorphism;

public class Main {


    //  This is the 1st type Of Polymorphism and Box is the 2nd type Of Polymorphism
    // Here  the Definition is same

    public static void main(String[] args) {
       Shapes shape=new Shapes();
       shape.area();

       Circle circle=new Circle();
       circle.area();

       Triangle triangle=new Triangle();
       triangle.area();

       Squre squre=new Squre();
        squre.area();

    }
}
