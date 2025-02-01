import static java.lang.System.out;

public class CarTest {

    //nested class
    class car {

        //Atributes or datas

        boolean engineison;
        boolean openddoors;
        String make;
        String model;
        String made;
        String colour;

        //method (behaviour)
        void engine_is_on() {
            out.println("engine is on");
            engineison = true;
        }

        void engine_is_off() {
            out.println("engine is off");
            engineison = false;

        }

        void opened_doors() {
            out.println("opened doors");
            openddoors = true;

        }

        void closed_doors() {
            out.println("closed doors");
            openddoors = false;

        }

        //(the rule based on clients ask)
        void car_starts_moving() {                             //(the car starts moving while doors are closed)
            if (engineison && !openddoors){
                out.println("the car starts moving");
            }
            else {
                out.println("the car is stopped");
            }
        }
    }
}
