package Encapsulation.DataValidation;

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
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }



    private void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("Names must be at least 3 symbols");
        }
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Names must be at least 3 symbols");
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Age must not be zero or negative");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary can't be less than 460.0");
        }
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
