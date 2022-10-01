package Reflecion_Exercise.harvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		Class<RichSoilLand> clazz = RichSoilLand.class;
		Field[] declaredFields = clazz.getDeclaredFields();

		String input;

		while (!(input = reader.readLine()).equals("HARVEST")) {
			//do work
			switch (input) {
				case "private":
					Arrays.stream(declaredFields)
							.filter(field -> Modifier.isPrivate(field.getModifiers()))
							.forEach(field -> {
								printField(field);
							});
					break;
				case "protected":
					Arrays.stream(declaredFields)
							.filter(field -> Modifier.isProtected(field.getModifiers()))
							.forEach(Main::printField);
					break;
				case "public":
					Arrays.stream(declaredFields)
							.filter(field -> Modifier.isPublic(field.getModifiers()))
							.forEach(Main::printField);
					break;
				case "all":
					Arrays.stream(declaredFields)
							.forEach(Main::printField);
					break;
			}
		}

	}

	private static void printField(Field field) {
		System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()),
				field.getType().getSimpleName(),
				field.getName());
	}
}
