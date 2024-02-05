package creationalPattern.builder;

public interface Builder {
    void reset(boolean reset);
    void setSeats(int number);
    void setEngine(String engine);
    void setTripComputer(boolean tripComputer);
    void setGPS(boolean gps);
}
