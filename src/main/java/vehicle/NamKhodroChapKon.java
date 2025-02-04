package vehicle;

public class NamKhodroChapKon { // open close principle ,  dependency injection

    Vehicle[] vehicles;

    //constructor
    public NamKhodroChapKon(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public String execute() {
        String namKhodroha = "";

        for (int neshanegar = 0; neshanegar < vehicles.length; neshanegar++) {
            Vehicle vehicle = vehicles[neshanegar];
            if (neshanegar != vehicles.length -1) {
                namKhodroha = namKhodroha + vehicle.getMark() + "-";
            } else {
                namKhodroha = namKhodroha + vehicle.getMark();

            }

        }
        return namKhodroha;

    }
}