package OOPS.Package.Poperty_Inheritence;

public class Main {
    public static void main(String[] args) {

        //  This is the 1st type Of Polymorphism and Box is the 2nd type Of Polymorphism
        // Here the definition is different

        //   Box box=new Box(4,6,3);

        //    Box box1=new Box(box);

     //   BoxWeight box3=new BoxWeight();

      //  BoxWeight box4 =new BoxWeight(4,5,6,7);

      //  Box box5=new Box(box4);

      //  BoxWeight box6=new BoxWeight(2,6,7);

       //  BoxWeight box7=new BoxWeight(2,3);

       // BoxColour box8=new BoxColour(2,3,4,"Red");

        Box box=new BoxWeight();
        box.greeting();


       // System.out.println(box.l+" "+ box.h+" "+ box.w);

       //  System.out.println(box1);

     //   System.out.println(box4.l+" "+ box4.h+" "+ box4.w+" "+ box4.weight);

        // not accessing cause
       // System.out.println(box5.weight);

       // System.out.println(box6.h);

       //  System.out.println(box7.side);

      //  System.out.println(box8.colour);

       // Box.greeting();

    }
}
