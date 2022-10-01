package ExceptionsAndErrorHandling.ValidPerson;

public class Main {
    public static void main(String[] args) {
        Person peter = new Person("Franco", "Aimee", 19);
        System.out.println(peter);

        try {
            Person noName = new Person(" ", "Aimee", 19);
            Person noLastName = new Person("Franco", null, 19);
            Person negativeAge = new Person("Franco", "Aimee", -19);
            Person tooOldForThisProgram = new Person("Franco", "Aimee", 121);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception thrown: " + ex.getMessage());
        }

    }
}
