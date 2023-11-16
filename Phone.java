public class Phone extends CISItem {

    private String location;


    public Phone(String name, String location, int model, String manufacturer) {
        super(name,location, model, manufacturer);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}