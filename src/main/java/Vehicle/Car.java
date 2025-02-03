package Vehicle;

public class Car {

    //Atributes or Dade
    boolean engine;   //false
    boolean doors;   //false
    String make;
    String model;
    String made;
    String colour;
    Driver driver;

    //constructor
     public Car (String make,String model, String made,String colour){
        this.make = make;
        this.made = made;
        this.model = model;
        this.colour = colour;
     }


    //method (behaviour)
  public void engineIsOn()  {
        engine = true;
    }

    void engineIsOff() {
        engine = false;

    }

    void openedDoors() {
        doors = true;

    }

    void closedDoors() {
        doors = false;

    }

    //(the rule based on clients ask)
    public boolean startsMoving() {                             //(the car starts moving while doors are closed)
        if (engine && !doors) {
            return true;
        } else {
            return false;
        }
    }
}