package InterfacesAndAbstraction_Lab.Ferrari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String driver = reader.readLine();

        Ferrari ferrari = new Ferrari(driver);

        System.out.println(ferrari);
    }
}
