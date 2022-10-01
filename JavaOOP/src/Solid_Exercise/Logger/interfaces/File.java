package Solid_Exercise.Logger.interfaces;

public interface File {
    int getSize();
    boolean write(String text);
    void append(String text);
}
