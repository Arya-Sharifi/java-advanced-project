import vehicle.Car;
import org.junit.jupiter.api.Test;
import vehicle.Vehicle;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

        @Test
        void test_the_cars_moving() {
                //given
                Vehicle benz = new Car("benz","cls","germany","black maetalic");
                Vehicle bmw =  new Car("bmw","serises7","germany","blue mate");

                //when
               boolean isengineon = benz.startsMoving();
               bmw.enginIsOn();
               boolean bmwisengineon = bmw.startsMoving();

               //then
                assertFalse(isengineon);
                assertTrue(bmwisengineon);
        }

}

