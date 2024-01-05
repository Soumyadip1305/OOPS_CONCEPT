package OOPS.Package.Access;

import java.util.ArrayList;

// I USE Singletons CLASS FOR BETTER EXPLANATION GO AND CHECK ==>>

public class Main {
    public static void main(String[] args) {
        A obj=new A(10,"Soumyadip");
        System.out.println(obj.getNum());

         // obj.setNum(13);
        // System.out.println(obj.getNum());

         // ArrayList<Integer>list=new ArrayList<>();
        // DEFAULT_CAPACITY is private access in java.util.ArrayList, So We can't access it .
       // list.DEFAULT_CAPACITY;
    }
}
