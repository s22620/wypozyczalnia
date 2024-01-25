package pl.pjatk.Wypozyczalnia;

public class Car {

    private String model;
    private String make;
    private String carClass;
    private String vin;
    private boolean available = true;

    public Car(String model, String make, String carClass, String vin) {
        this.model = model;
        this.make = make;
        this.carClass = carClass;
        this.vin = vin;
    }

    public Car(String model, String make, String carClass, String vin, boolean available) {
        this.model = model;
        this.make = make;
        this.carClass = carClass;
        this.vin = vin;
        this.available = available;
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

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void getInfoCar() {
        System.out.println("model: " + this.getModel());
        System.out.println("make: " + this.getMake());
        System.out.println("carClas: " + this.getCarClass());
        System.out.println("vin: " + this.getVin());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", carClass='" + carClass + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }
}
