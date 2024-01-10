import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Luigi",25);
        Student student2 = new Student("Paul",27);

        //n element list
        List<Student> studentsList = new ArrayList<>(List.of(student1,student2));

        //print list
        System.out.println(studentsList);

        //new member
        Student student3 = new Student("Federico",30);
        Student student4 = new Student("Ivan",27);
        Student student5 = new Student("Stefano",30);
        Student student6 = new Student("Domenico",22);

        //add new member
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);
        studentsList.add(student6);

        //print new list
        System.out.println(studentsList);
    }
}
