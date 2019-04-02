public abstract class Component {

    private String make;
    private String model;

    public Component(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


}
