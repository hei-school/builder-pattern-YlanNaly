package creationalPattern.builder;

public class CarManualBuilder implements Builder{
    int seatNumber;
    String carEngine;
    boolean tripComputer;
    boolean reset;
    boolean GPS;
    @Override
    public void reset(boolean reset) {
        this.reset = reset;
    }

    @Override
    public void setSeats(int number) {
        this.seatNumber = number;
    }

    @Override
    public void setEngine(String engine) {
        this.carEngine = engine;
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(boolean gps) {
        this.GPS = gps;
    }
}
