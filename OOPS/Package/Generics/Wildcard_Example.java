package OOPS.Package.Generics;

import OOPS.Package.Polymorphism.Number;

import java.util.Arrays;
import java.util.List;

public class Wildcard_Example<T extends Number> {
    private  Object[]data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public Wildcard_Example() {
        data=new Object[DEFAULT_SIZE];
    }
    public void getList(List<? extends Number>list){
        // do something

        // here you can only pass number type
    }

    public void add(int num){
        if (isFull()) {
            resize();
        }
         data[size++]=num;

    }

    private void resize() {
        Object[]temp=new Object[data.length*2];
        // copy the current item in te array
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    public T remove(){
        T remove=(T)(data[--size]);
        return remove;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "Custom_Arraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        //   ArrayList list=new ArrayList();
        Wildcard_Example list2=new Wildcard_Example();
        //  list2.add(4);
        //  list2.add(35);
        //  list2.add(23);
        //  list2.add(67);

        //  for (int i = 0; i < 14; i++) {
        //     list2.add(2*i);
        //  }
        //  System.out.println(list2);
         // ArrayList<String_x > list3=new ArrayList<>();
         //  list3.add("123");   // This is generics



        Wildcard_Example<Number>list4=new Wildcard_Example();
        for (int i = 0; i < 14; i++) {
            list4.add(2*i);
        }

        System.out.println(list4);;
    }
}
