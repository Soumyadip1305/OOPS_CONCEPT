package OOPS.Package.Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Integer>list=new ArrayList<>();
        List <Integer>list2=new LinkedList<>();

        list2.add(32);
        list2.add(78);
        list2.add(89);
        list2.add(90);
        System.out.println(list2);

        List <Integer>vector=new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println(vector);
    }
}
