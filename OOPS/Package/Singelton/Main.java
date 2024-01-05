package OOPS.Package.Singelton;

import OOPS.Package.Access.A;

public class Main {

    public static void main(String[] args) {
        Singletons obj= Singletons.getinstance();
        System.out.println(obj.num);

        A obj1=new A(20,"Rocky");
        System.out.println(obj1.getNum());
        // name' has protected access in 'OOPS.Package.Access.AtCoder_Contest'
        //  System.out.println(obj1.name);


    }
}