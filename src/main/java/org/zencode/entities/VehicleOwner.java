public class VehicleOwner {
    private String code;
    private String name;
    private Address address;

    public VehicleOwner() {
        this.code = "";
        this.name = "";
        this.address = new Address();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
