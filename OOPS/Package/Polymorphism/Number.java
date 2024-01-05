package OOPS.Package.Polymorphism;

public class Number {

    // Order of the type  should be different  This is call Compile Time Polymorphism :~
   // void sum(int AtCoder_Contest, String_x  b){
   // }
  //  void sum(String_x b,int AtCoder_Contest){
  //  }

    int sum(int a, int  b) {
        return a + b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Number ob=new Number();
        System.out.println(ob.sum(1,2));
        System.out.println(ob.sum(1,2,3));
    }
}
