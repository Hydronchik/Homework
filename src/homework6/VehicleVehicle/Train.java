package homework6.VehicleVehicle;

public class Train extends VehicleVehicle{
    @Override
    public void travel() {
        System.out.println("Подорож відбувається в потязі");
    }

    public Train() {
    }

    @Override
    public String toString() {
        return "Train{} " + super.toString();
    }
}
