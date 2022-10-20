package hw5.controlPanel;

import hw5.controlPanel.AirGauge;
import hw5.controlPanel.Altimeter;

public class ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();

    public void control(){
        System.out.println(altimeter);
        System.out.println(airGauge);
    }
}
