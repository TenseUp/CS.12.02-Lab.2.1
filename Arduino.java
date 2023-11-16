public class Arduino extends CISItem {

    private String model;

    public Arduino(String name, String model, int size, String manufacturer) {
        super(name, model, size, manufacturer);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}