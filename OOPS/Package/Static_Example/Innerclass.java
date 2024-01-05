package OOPS.Package.Static_Example;

public class Innerclass {
    static class test {
        String name;
        public test(String name){
            this.name=name;
        }

        @Override
        public String toString() {
            return name;
        }

        public String tostring() {
            return name;
        }
    }
    public static void main(String[] args) {
        test a =new test("Soumyadip Saha");
        test b =new test("Trisha Ghosh");
        //System.out.println(AtCoder_Contest.name);
        //System.out.println(b.name);
        System.out.println(a+" _ "+b);
    }
}

