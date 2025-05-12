package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean status;

    public TemperatureSensor() {
        this.status = false;
    }

    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public void setOff() {
        this.status = false;
    }

    @Override
    public int read() {
        if (!status) {
            throw new IllegalArgumentException("Sensor is Off");
        } else {
            Random rand = new Random();
            int num = rand.nextInt(61) - 30;
            return num;
        }
    }

    @Override
    public boolean isOn() {
        return status;
    }

    public static void main(String[] args) {
        Sensor kumpula = new TemperatureSensor();
//        kumpula.setOn();
        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();
    }
}
