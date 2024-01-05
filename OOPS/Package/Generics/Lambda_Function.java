package OOPS.Package.Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda_Function {
    public static void main(String[] args) {

       // ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 1; i < 6; i++) {
//            arr.add(i);
//        }
//
//        arr.forEach((item) -> System.out.arraySubsequence(item * 2 + " "));
//        Consumer<Integer> fun = (item) -> System.out.arraySubsequence(item * 2 + " ");
//        arr.forEach(fun);

 //         Operation Of AtCoder_Contest & B :~
//        Operation sum = (AtCoder_Contest, b) -> AtCoder_Contest + b;
//        Operation multiplication = (AtCoder_Contest, b) -> AtCoder_Contest * b;
//        Operation subtraction = (AtCoder_Contest, b) -> AtCoder_Contest - b;
//        Operation division = (AtCoder_Contest, b) -> AtCoder_Contest / b;
//        Lambda_Function calculator=new Lambda_Function();
//        System.out.println(calculator.operation(2,3,sum));
//        System.out.println(calculator.operation(2,3,multiplication));
//        System.out.println(calculator.operation(2,3,division));
//        System.out.println(calculator.operation(2,3,subtraction));
    }
    private int operation(int a,int b,Operation op){
        return op.operation(a,b);
    }
}
interface Operation {
    int operation(int a, int b);
}