import adapter.School;
import adapter.Student;
import composite.Car;

public class App {
    public static void main(String[] args) throws Exception {
        // Composition example
        Car car = new Car();
        car.startCar();

        // Aggregation example
        School school = new School();
        school.addStudent(new Student("Alice"));
        school.addStudent(new Student("Bob"));
        school.showStudents();
    }
}
