import vehicle.Vehicle;

public class Ship extends Vehicle {
    @Override
    public boolean startsMoving() {
        return false;
    }

    @Override
    public String getMark() {
        return "ship";
    }
}
