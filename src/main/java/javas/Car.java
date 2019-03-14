package javas;

public class Car{
    public String brand;
    public String numberPlate;
    public int noOfDoors;

    public Car(String brand, String numberPlate, int noOfDoors) {
        this.brand = brand;
        this.numberPlate = numberPlate;
        this.noOfDoors = noOfDoors;
    }

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", numberPlate=" + numberPlate + ", noOfDoors=" + noOfDoors + "]";
	}
}