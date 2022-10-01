package Encapsulation_Lab.ValidationData;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        ensureNameLength(firstName, "First");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        ensureNameLength(lastName, "Last");
        this.lastName = lastName;
    }

    private void ensureNameLength(String name, String namePrefix) {
        if (name.length() < 3) {
            throw new IllegalArgumentException(namePrefix + " name cannot be less than 3 symbols");
        }
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }

        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if (this.getAge() < 30) {
            this.setSalary(this.getSalary() + this.getSalary() * bonus / 200);
        }else {
            this.setSalary(this.getSalary() + this.getSalary() * bonus / 100);
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.0####");
        return String.format("%s %s gets %s leva", getFirstName(), getLastName(), df.format(getSalary()));
    }
}
