package Reflecion_Exercise.barracksWars.core.factories;

import Reflecion_Exercise.barracksWars.interfaces.Unit;
import Reflecion_Exercise.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"Reflecion_Exercise.barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) {
		try {
			Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<Unit> unitConstructor = unitClass.getDeclaredConstructor();
			return unitConstructor.newInstance();
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			return null;
		}
	}
}
