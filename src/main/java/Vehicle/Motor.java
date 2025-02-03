package Vehicle;

public class Motor {

    //Atributes or Dade
     static boolean engine;   //false


    //method (behaviour)
    public void enginIsOn() {
        engine = true;
    }

   public void engineIsOff() {
        engine = false;

    }

    public static boolean startsMoving() {
        return engine;
    }
}
