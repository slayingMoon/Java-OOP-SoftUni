package InterfacesAndAbstraction_Lab.SayHello;

public interface Person {
    String getName();

    default String sayHello() {
        return "Hello";
    }
}
