package Reflecion_Exercise.barracksWars;

import Reflecion_Exercise.barracksWars.interfaces.Repository;
import Reflecion_Exercise.barracksWars.interfaces.Runnable;
import Reflecion_Exercise.barracksWars.interfaces.UnitFactory;
import Reflecion_Exercise.barracksWars.core.Engine;
import Reflecion_Exercise.barracksWars.core.factories.UnitFactoryImpl;
import Reflecion_Exercise.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
