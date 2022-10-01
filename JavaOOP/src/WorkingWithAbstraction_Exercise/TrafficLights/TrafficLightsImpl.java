package WorkingWithAbstraction_Exercise.TrafficLights;

import java.util.Iterator;

public class TrafficLightsImpl implements Iterator<TrafficLights> {

    private TrafficLights currentLight;

    public TrafficLightsImpl(TrafficLights currentLight) {
        this.currentLight = currentLight;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public TrafficLights next() {
        switch (this.currentLight.name()) {
            case "RED":
                this.currentLight = TrafficLights.valueOf("GREEN");
                break;
            case "GREEN":
                this.currentLight = TrafficLights.valueOf("YELLOW");
                break;
            case "YELLOW":
                this.currentLight = TrafficLights.valueOf("RED");
                break;
        }
        return this.currentLight;
    }
}
