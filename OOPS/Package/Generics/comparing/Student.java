package OOPS.Package.Generics.comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;
    public Student(int rollno,float marks) {
        this.rollno = rollno;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return rollno+ " > "+marks;
    }

    @Override
    public int compareTo(Student old) {
        int difference= (int) (this.marks-old.marks);
        // If diff==0 : Both Are Equal
        // If diff<1 : means old is bigger else Old is smaller
        return difference;
    }
}
