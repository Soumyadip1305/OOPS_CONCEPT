package OOPS.Package.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[]arr;

    public Human(String name,int age) {
        this.name = name;
        this.age = age;
        this.arr=new int[]{1,2,3,4,5};
    }
//

    @Override
    public Object clone() throws CloneNotSupportedException{
        // this  is deep copy
        Human twin=(Human) super.clone();// This is actually shallow copy

        // make AtCoder_Contest deep copy
        twin.arr=new int[twin.arr.length];
        for (int i = 0; i < arr.length ; i++) {
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }
}
