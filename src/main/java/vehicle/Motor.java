package vehicle;

public class Motor extends Vehicle {

    public  boolean startsMoving() {
        return engine;
    }

    @Override
    public String getMark() {
        return "motor";
    }
}

