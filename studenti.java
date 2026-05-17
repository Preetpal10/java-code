import java.util.ArrayList;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

public class studenti {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Preet"));
        list.add(new Student("Rahul"));

        for (Student s : list) {
            System.out.println(s.name);
        }
    }
}