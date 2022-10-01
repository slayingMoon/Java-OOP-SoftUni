package ExceptionsAndErrorHandling.ValidPerson;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (StringUtils.isNullOrEmpty(firstName)) {
            throw new IllegalArgumentException("The first name cannot be null or empty");
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (StringUtils.isNullOrEmpty(lastName)) {
            throw new IllegalArgumentException("The last name cannot be null or empty");
        }

        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age should be in the range [0 ... 120]");
        }

        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.firstName, this.lastName, this.age);
    }
}
