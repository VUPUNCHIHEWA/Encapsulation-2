public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("ABC123", "Toyota ", "123456789", 25.5);

        // Display car details
        myCar.displayCarDetails();

        // Update car details
        myCar.setCarNumber("XYZ789");
        myCar.setModelName("Honda ");
        myCar.setChasisNumber("987654321");

        // Display updated car details
        myCar.displayCarDetails();
    }

}
