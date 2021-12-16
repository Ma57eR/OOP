package Encapsulation.SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private double increaseSalary;

    public void setIncreaseSalary(double increaseSalary) {
        this.increaseSalary = increaseSalary;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public double getIncrease() {
        return increaseSalary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void increaseSalary(double percentage) {
        if (age < 30) {
            percentage = percentage / 2;
        }
        this.salary = this.salary * (1 + percentage / 100);
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva",
                this.firstName,
                this.lastName,
                this.salary);
    }
}
