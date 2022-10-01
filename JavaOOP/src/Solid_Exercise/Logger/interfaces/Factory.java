package Solid_Exercise.Logger.interfaces;

public interface Factory<T> {
    T produce(String input);
}
