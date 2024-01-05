package OOPS.Package.Generics;

import com.sun.source.tree.IdentifierTree;

import java.util.ArrayList;
import java.util.Arrays;


public class Custom_Arraylist {
    private int[]data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public Custom_Arraylist() {
       this.data=new int[DEFAULT_SIZE];
    }
    public void  add(int num){
        if (isFull()) {
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[]temp=new int[data.length*2];
        // copy the current item in te array
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    public int remove(){
        int remove=data[--size];
        return remove;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
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
        Custom_Arraylist list2=new Custom_Arraylist();
      //  list2.add(4);
      //  list2.add(35);
      //  list2.add(23);
      //  list2.add(67);

        for (int i = 0; i < 14; i++) {
            list2.add(2*i);
        }
        System.out.println(list2);
        ArrayList<Integer>list3=new ArrayList<>();
       // list3.add("123");   // This is generics
    }
}
