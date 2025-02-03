import Vehicle.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MotorTest {


    @Test
    void test_the_motors_moving() {
        //given
        Motor motor = new Motor();

        //when
        motor.enginIsOn();
        boolean isengineon = Motor.startsMoving();


        //then
        assertTrue(isengineon);
    }




}
