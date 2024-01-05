package OOPS.Package.Exception_Handling;

import java.beans.ExceptionListener;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
       // int c=AtCoder_Contest/b;  // This is Arithmetic Exception
        try {
           // int c=AtCoder_Contest/b;
           // divide(AtCoder_Contest,b);
           // throw new Exception("Just for fun");
            String name="Soumya";
            if (name.equals("Soumya")){
                throw new My_Exception("Name is soumyadip");
            }
        }
        catch (My_Exception e){  // It's catching the arithmetic exception
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){  // It's catching the arithmetic exception
            System.out.println(e.getMessage());
        }
        catch (Exception e) {  // It's catching the arithmetic exception
            System.out.println("Normal exception");
        }
        finally {
             System.out.println("This will always executed ");
        }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if (b==0){
            // Its throw the arithmetic exception
           throw new  ArithmeticException("Not Divisible");
        }
        return a/b;
    }
}
