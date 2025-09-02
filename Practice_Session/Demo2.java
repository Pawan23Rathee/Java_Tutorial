class Student {
    private String name;
    private int age;

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public int setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
        return this.age;
    }
}

public class Demo2{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(20);

        System.out.println("Name: " + student.setName("John"));
        System.out.println("Age: " + student.setAge(20));
    }
}