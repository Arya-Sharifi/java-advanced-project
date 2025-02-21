package vehicle;

//Car as vehicle
//yek mashin ke ye vehicle ast va daraye sandogh va gearbox ast
//chon baraye verastgri mahdodiat ast ma miyaym az interface estefade mkonim ke implement ra mizarim
public class Car extends Vehicle implements TrunkCapacity,Gearbox {

    //Atributes or Dade
    public int doorsnumbers = 4;
    private boolean doors;   //false
    private  String mark;
    private  String model;
    private int capacityoftrunk;
    private GearboxEnum noeDande;
    public static int thenumbersofsellingcars;

    //constructor
     public Car (String mark,String model, int capacityoftrunk,GearboxEnum noeDande){
        this.mark = mark;
        this.model = model;
        this.capacityoftrunk = capacityoftrunk;
        this.noeDande = noeDande;

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
    public String getModel(){
        return model;
    }


    @Override
    public int capacityOfTrunk() {
        return capacityoftrunk;
    }

    @Override
    public GearboxEnum typeGearBox() {
        return noeDande();
    }

    private GearboxEnum noeDande() {
         return noeDande();
    }
}