package vehicle;

//Car as vehicle
//yek mashin ke ye vehicle ast va daraye sandogh va gearbox ast
//chon baraye verastgri mahdodiat ast ma miyaym az interface estefade mkonim ke implement ra mizarim
public class Car extends Vehicle implements TrunkCapacity,Gearbox {

    //Atributes or Dade
    private boolean doors;   //false
    private String mark;
    private String model;
    private String made;
    private String colour;
    private int capacityoftrunk;
    private String gearbox;
    private Driver driver;

    //constructor
     public Car (String mark,String model, String made,String colour){
        this.mark = mark;
        this.model = model;
        this.made = made;
        this.colour = colour;
     }

    public Car(String mark, int capacityoftrunk, String gearbox) {
        this.mark = mark;
        this.capacityoftrunk = capacityoftrunk;
        this.gearbox = gearbox;
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

    @Override
    public String getMark() {
        return mark;
    }

    @Override
    public String typeGearBox() {
        return "automatic";
    }

    @Override
    public int capacityOfTrunk() {
        return 100;
    }
}