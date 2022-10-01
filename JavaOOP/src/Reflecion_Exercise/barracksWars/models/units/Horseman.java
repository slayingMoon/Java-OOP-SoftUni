package Reflecion_Exercise.barracksWars.models.units;

public class Horseman extends AbstractUnit {
    private static final int HORSEMAN_HEALTH = 50;
    private static final int HORSEMAN_DAMAGE = 10;

    public Horseman(int HORSEMAN_HEALTH, int HORSEMAN_DAMAGE) {
        super(HORSEMAN_HEALTH, HORSEMAN_DAMAGE);
    }
}
