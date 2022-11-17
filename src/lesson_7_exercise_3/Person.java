package lesson_7_exercise_3;

public class Person {
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " is going");
    }
    public void talk() {
        System.out.println(fullName + " is talking");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person() {

    }

}
