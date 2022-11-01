import org.example.ElectricityBill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestElectricityBill {

    @Test
    public void testConstructor(){
        ElectricityBill eb = new ElectricityBill(428.22 , 38.22);

        assertEquals(428.22 , eb.getBillToPay());
        assertEquals(38.22 , eb.getServiceCharge());
    }

    @Test
    public void testUnit(){
        ElectricityBill eb = new ElectricityBill(100);

        assertEquals(100 , eb.getUnits());
    }

    @Test
    public void testLessThan150UnitCase(){
        ElectricityBill eb120 = new ElectricityBill(120);
        eb120.calculateElectricityBill();

        assertEquals(428.22 , eb120.getBillToPay());
    }

    @Test
    public void test150To400UnitCase(){
        ElectricityBill eb278 = new ElectricityBill(278);
        eb278.calculateElectricityBill();

        assertEquals(1211.3799999999999 , eb278.getBillToPay());
    }

    @Test
    public void testMoreThan400UnitCase(){
        ElectricityBill eb590 = new ElectricityBill(590);
        eb590.calculateElectricityBill();

        assertEquals(2646.02 , eb590.getBillToPay());
    }

    @Test
    public void test150UnitCase(){
        ElectricityBill eb150 = new ElectricityBill(150);
        eb150.calculateElectricityBill();

        assertEquals(525.72 , eb150.getBillToPay());
    }

    @Test
    public void test400UnitCase(){
        ElectricityBill eb400 = new ElectricityBill(400);
        eb400.calculateElectricityBill();

        assertEquals(1726.22 , eb400.getBillToPay());
    }

    @Test
    public void testDecimalCase(){
        ElectricityBill eb12075 = new ElectricityBill(120.75);
        eb12075.calculateElectricityBill();

        assertEquals(430.6575 , eb12075.getBillToPay());
    }

    @Test
    public void testMinusCase(){
        ElectricityBill eb45 = new ElectricityBill(-45);
        eb45.calculateElectricityBill();

        assertEquals(-108.03 , eb45.getBillToPay());
    }


    @Test
    public void testMinusDecimalCase(){
        ElectricityBill eb58925 = new ElectricityBill(-589.25);
        eb58925.calculateElectricityBill();

        assertEquals(-1876.8425 , eb58925.getBillToPay());
    }

    @Test
    public void testNullCase(){
        ElectricityBill eb0 = new ElectricityBill(0);
        eb0.calculateElectricityBill();

        assertNotNull(eb0.getUnits());
    }

}
