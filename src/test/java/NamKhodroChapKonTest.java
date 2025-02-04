import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.Car;
import vehicle.Motor;
import vehicle.NamKhodroChapKon;
import vehicle.Vehicle;

public class NamKhodroChapKonTest {
    @Test
    void Bayad_Nam_Khodro_Ra_Chap_Konad() {
        //creating objects of Car , Motor , Ship
        Vehicle peugeot = new Car("peugeot",120,"manual");
        Vehicle nissan = new Car("nissan",120,"automatic");
        Vehicle motor = new Motor();
        Vehicle ship = new Ship();
            Vehicle [] vehicles = {peugeot,nissan,motor,ship};
            NamKhodroChapKon namKhodroChapKon = new NamKhodroChapKon(vehicles);

            //when
        String listofvehicles = namKhodroChapKon.execute();

        //then
        Assertions.assertEquals("peugeot-nissan-motor-ship",listofvehicles);

    }
}
