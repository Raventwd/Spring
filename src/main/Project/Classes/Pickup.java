package Project;

public class Pickup extends Transport{
    private String model = "Pickup";
    public Pickup(String model) {
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
        return "Pickup{" +
                "model='" + model + '\'' +
                '}';
    }
}