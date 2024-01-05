package OOPS.Package.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        //Son son = new Son();
        Son son = new Son(20);
          // System.out.println(son.age);
         // son.career("Coder");
         // son.partner("Special one",19);
         // son.career();
         //  Daughter daughter=new Daughter();
         Daughter daughter = new Daughter(24);
         // daughter.career();
        // daughter.partner();


        // For Abstract classes you can't create like this
        /*parent mom = new parent(38) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        };*/

        parent.hello();
    }
}
