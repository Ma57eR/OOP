package Abstract.StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }

    public Map<String, Student> getStudents() {
        return this.students;
    }

    public void parseCommand(String[] args) {

        String command = args[0];

        switch (command) {
            case "Create":
                addStudent(args[1], Integer.parseInt(args[2]), Double.parseDouble(args[3]));
                break;
            case "Show":
                showStudent(args[1]);
                break;
            default:
            throw new IllegalArgumentException("Unknown command " + command);
        }
    }

    private void showStudent(String name) {
        if (students.containsKey(name)) {
            Student student = students.get(name);
            String output = String.format("%s is %s years old.", student.getName(), student.getAge());

            if (student.getGrade() >= 5.00) {
                output += " Excellent student.";
            } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                output += " Average student.";
            } else {
                output += " Very nice person.";
            }

            System.out.println(output);
        }
    }

    private void addStudent(String thisName, int thisAge, double thisGrade) {
        this.students.putIfAbsent(thisName, new Student(thisName, thisAge, thisGrade));
    }
}
