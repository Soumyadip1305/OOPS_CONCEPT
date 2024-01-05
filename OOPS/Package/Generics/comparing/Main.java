package OOPS.Package.Generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Soumyadip = new Student(30, 89.6f);
        Student Subhadip = new Student(20, 68.6f);
        Student Soumit = new Student(28, 78.6f);
        Student Arani = new Student(11, 98.6f);
        Student Sayan = new Student(2, 95.6f);
        Student[]list={Soumyadip,Subhadip,Soumit, Arani,Sayan};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
       // System.out.println(Arrays.toString(list));

        Arrays.sort(list, (o1, o2) -> -(int) (o1.marks-o2.marks));
        System.out.println(Arrays.toString(list));
//    if (Soumyadip.compareTo(Subhadip)<0){
//        System.out.println(Soumyadip.compareTo(Subhadip));
//        System.out.println("Subhadip has more marks ");
//    }
    }
}
