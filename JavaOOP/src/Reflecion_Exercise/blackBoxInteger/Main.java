package Reflecion_Exercise.blackBoxInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<BlackBoxInt> clazz = BlackBoxInt.class;   //get meta info about BlackboxInt.class
        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();  //get empty constructor
        constructor.setAccessible(true);  //make this constructor public
        BlackBoxInt blackBoxInt = constructor.newInstance(); //create blackBox instance

        Field innerValue = clazz.getDeclaredField("innerValue");  //get metadata regarding innerValue
        innerValue.setAccessible(true);  //make it public

        String input;

        while (!(input = reader.readLine()).equals("END")) {
            String[] methodData = input.split("_");
            String methodName = methodData[0];
            int value = Integer.parseInt(methodData[1]);

            Method method = clazz.getDeclaredMethod(methodName, int.class); //get method from BlackBoxInt by its name and arguments(signature)
            method.setAccessible(true); //make the method public
            method.invoke(blackBoxInt, value);  //call the method on the blackBoxInt instance we have

            System.out.println(innerValue.get(blackBoxInt));  //get the innerValue of blackBoxInt instance
        }
    }
}
