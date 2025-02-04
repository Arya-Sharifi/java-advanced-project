package vehicle;

public abstract class Vehicle {

     boolean engine;   //false


    //method (behaviour)
    public void enginIsOn() {
        engine = true;
    }

     void engineIsOff() {
        engine = false;
    }

    public abstract boolean startsMoving();

    public abstract String getMark();
}

