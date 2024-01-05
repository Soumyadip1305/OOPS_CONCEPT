package OOPS;
    public class Main {
        public static void main(String[] args) {
            // store 5 roll nos
            int[] numbers = new int[5];

            // store 5 names
            String[] names = new String[5];

            // data of 5 students: {roll no, name, marks}
            int[] rno = new int[5];
            String[] name = new String[5];
            float[] marks = new float[5];

            Student[] students = new Student[5];

            // just declaring
//        Student soumya;
//        soumya = new Student();

           Student soumya = new Student(15, "Soumyadip Saha", 85.4f);
            Student Arindam = new Student(18, "Arindam Roy", 90.3f);

//        soumya.rno = 13;
//        soumya.name = "Soumyadip Saha";
//        soumya.marks = 88.5f;


//        soumya.changeName("Shoe lover");
      //  soumya.greeting();

//
         //   System.out.println(soumya.rno);
        //    System.out.println(soumya.name);
        //    System.out.println(soumya.marks);

            Student random = new Student(soumya);
            System.out.println(random.name);

            Student random2 = new Student();
            System.out.println(random2.name);

           // Student one = new Student();
           // Student tw = one;

           // one.name = "Something something";

         //   System.out.println(tw.name);

        }
    }

    // create AtCoder_Contest class
// for every single student
    class Student {
        int rno;
        String name;
        float marks = 90;

        // we need AtCoder_Contest way to add the values of the above
        // properties object by object

        // we need one word to access every object

          void greeting() {
            System.out.println("Hello! My name is " + this.name);
       }

        void changeName(String name) {
            this.name = name;
        }

        Student  (Student other) {
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        Student () {
            // this is how you call AtCoder_Contest constructor from another constructor
            // internally: new Student (13, "default person", 100.0f);
            this (13, "Arindam Roy", 100.0f);
        }


         //Student subhadip = new Student(17, "Arpit", 89.7f);
        // here, this will be replaced with arpit
        Student (int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

    }
