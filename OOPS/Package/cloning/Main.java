package OOPS.Package.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human Soumya = new Human("Soumyadip", 20);
        //Human twin=new Human(obj);
        Human twin = (Human) Soumya.clone();
        System.out.println(twin.name+" > "+twin.age);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]=18;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(Soumya.arr));
    }
}
