abstract class Employee {

    abstract void salary();
}

class Developer extends Employee {

    void salary() {
        System.out.println("Salary is 50000");
    }
}

public class employee1 {

    public static void main(String[] args) {

        Developer d = new Developer();

        d.salary();
    }
}
