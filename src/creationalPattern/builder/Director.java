package creationalPattern.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructSportsCar() {
        builder.reset(true);
        builder.setSeats(2);
        builder.setEngine("V8");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUV() {
        builder.reset(true);
        builder.setSeats(5);
        builder.setEngine("V6");
        builder.setTripComputer(false);
        builder.setGPS(true);
    }
}
