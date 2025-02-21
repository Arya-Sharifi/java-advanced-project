import org.junit.jupiter.api.Test;
import vehicle.Motor;
import vehicle.Vehicle;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MotorTest {


    @Test
    void test_the_motors_moving() {
        //given
        Vehicle motor = new Motor();            //object Motor

        //when
        motor.enginIsOn();
        boolean isengineon = motor.startsMoving();


        //then
        assertTrue(isengineon);
    }




}
