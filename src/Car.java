public class Car {
    private String Car_Number;
    private String model_name;
    private String Chasis_Number;
    private double Mileage;

    // Constructor
    public Car(String carNumber, String modelName, String chasisNumber, double mileage) {
        Car_Number = carNumber;
        model_name = modelName;
        Chasis_Number = chasisNumber;
        Mileage = mileage;
    }

    // Getter for Car_Number
    public String getCarNumber() {
        return Car_Number;
    }

    // Setter for Car_Number (public)
    public void setCarNumber(String carNumber) {
        Car_Number = carNumber;
    }

    // Getter for model_name
    public String getModelName() {
        return model_name;
    }

    // Setter for model_name (public)
    public void setModelName(String modelName) {
        model_name = modelName;
    }

    // Getter for Chasis_Number
    public String getChasisNumber() {
        return Chasis_Number;
    }

    // Setter for Chasis_Number (public)
    public void setChasisNumber(String chasisNumber) {
        Chasis_Number = chasisNumber;
    }

    // Getter for Mileage (private)
    private double getMileage() {
        return Mileage;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Number: " + Car_Number);
        System.out.println("Model Name: " + model_name);
        System.out.println("Chasis Number: " + Chasis_Number);
        System.out.println("Mileage: " + getMileage());
    }
}