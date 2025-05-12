package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;

    public AverageSensor() {
        sensors = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        boolean isAllOn = true;
        Iterator<Sensor> iterator = sensors.iterator();

        while (iterator.hasNext()) {
            if (!iterator.next().isOn()) {
                isAllOn = false;
            }
        }
        return isAllOn;
    }

    @Override
    public void setOn() {
        Iterator<Sensor> iterator = sensors.iterator();
        while (iterator.hasNext()) {
            iterator.next().setOn();
        }
    }

    @Override
    public void setOff() {
        Iterator<Sensor> iterator = sensors.iterator();

        while (iterator.hasNext()) {
            iterator.next().setOff();
            break;
        }
    }

    @Override
    public int read() {
        if (!isOn() || this.sensors.isEmpty()) {
            throw new IllegalArgumentException("No sensors or turned on!");
        }
        Iterator<Sensor> iterator = sensors.iterator();
        int sum = 0;
        int count = 0;

        while (iterator.hasNext()) {
            sum += iterator.next().read();
            count++;
        }
        return sum / count;
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public static void main(String[] args) {
        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();
        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
    }
}
