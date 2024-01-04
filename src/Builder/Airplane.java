package Builder;

public class Airplane {
    private String model;
    private String engine;
    private int seatingCapacity;

    public Airplane(String model, String engine, int seatingCapacity) {
        this.model = model;
        this.engine = engine;
        this.seatingCapacity = seatingCapacity;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }
}
