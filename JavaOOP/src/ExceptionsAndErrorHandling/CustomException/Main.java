package ExceptionsAndErrorHandling.CustomException;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Peter", "peter@gmail.com");
        System.out.println(student);

        try {
            Student invalid = new Student("4havdar", "4havdar@abv.bg");
        }catch (InvalidPersonNameException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
