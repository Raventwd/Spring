package Project.Classes;

public class Bus extends Transport{

    private String model = "Bus";
    public Bus(String model) {
        super(model);
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                '}';
    }
}