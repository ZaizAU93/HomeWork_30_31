package Builder;

public class AirplaneBuilder {
    private String model;
    private String engine;
    private int seatingCapacity;

    public AirplaneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public AirplaneBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public AirplaneBuilder setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
        return this;
    }

    public Airplane build() {
        return new Airplane(model, engine, seatingCapacity);
    }
}
