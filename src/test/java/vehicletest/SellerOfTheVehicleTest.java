import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import seller.Seller;
import vehicle.car.Car;

public class SellerOfTheVehicleTest {
    @Test
    void bayad_tedad_kol_mashin_haye_forokhte_shode_bedast_avarim() {
        //given
        Seller arya = new Seller();
        Seller amirhoseein = new Seller();

        amirhoseein.sellingthevehicle();
        amirhoseein.sellingthevehicle();
        arya.sellingthevehicle();
        arya.sellingthevehicle();
        arya.sellingthevehicle();

        Assertions.assertEquals(5, Car.thenumbersofsellingcars);
    }
}
