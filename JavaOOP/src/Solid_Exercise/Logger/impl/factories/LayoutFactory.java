package Solid_Exercise.Logger.impl.factories;

import Solid_Exercise.Logger.impl.Layouts.SimpleLayout;
import Solid_Exercise.Logger.impl.Layouts.XmlLayout;
import Solid_Exercise.Logger.interfaces.Factory;
import Solid_Exercise.Logger.interfaces.Layout;

public class LayoutFactory implements Factory<Layout> {
    @Override
    public Layout produce(String input) {
        Layout layout = null;

        if (input.equals("SimpleLayout")) {
            layout = new SimpleLayout();
        }else if (input.equals("XmlLayout")) {
            layout = new XmlLayout();
        }

        return layout;
    }
}
