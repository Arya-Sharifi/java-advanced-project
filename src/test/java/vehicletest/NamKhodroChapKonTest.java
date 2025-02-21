import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.*;
import vehicle.car.Car;
import vehicle.car.GearboxEnum;

public class NamKhodroChapKonTest {
    @Test
    void Bayad_Nam_Khodro_Ra_Chap_Konad() {
        //creating objects of Car , Motor , Ship
        Vehicle peugeot = new Car("peugeot","405",12, GearboxEnum.MANUAL);
        Vehicle nissan = new Car("nissan","gtr premium",10,GearboxEnum.AUTOMATIC);
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
