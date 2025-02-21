import vehicle.car.Car;
import org.junit.jupiter.api.Test;
import vehicle.car.GearboxEnum;
import vehicle.Vehicle;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

        @Test
        void test_the_cars_moving() {
                //given
                Vehicle benz = new Car("benz","cls",100, GearboxEnum.AUTOMATIC);
                Vehicle bmw =  new Car("bmw","serises7",120,GearboxEnum.MANUAL);

                //when
               boolean isengineon = benz.startsMoving();
               bmw.enginIsOn();
               boolean bmwisengineon = bmw.startsMoving();

               //then
                assertFalse(isengineon);
                assertTrue(bmwisengineon);
        }

}

