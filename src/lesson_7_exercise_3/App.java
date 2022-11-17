package lesson_7_exercise_3;

public class App {
    public static void main(String[] args) {
        Person first = new Person();
        first.setFullName("Mr. First");
        first.setAge(70);

        Person second = new Person("Mr. Second", 20);
    }
}
