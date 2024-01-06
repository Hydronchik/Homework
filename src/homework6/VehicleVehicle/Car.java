package homework6.VehicleVehicle;

public class Car extends VehicleVehicle{
    @Override
    public void travel() {
        System.out.println("Подорож відбувається в машині");
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }
}
