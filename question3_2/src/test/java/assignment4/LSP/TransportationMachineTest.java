package assignment4.LSP;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Admin on 2017/03/31.
 */
public class TransportationMachineTest {
    Car myCar;
    Bicycle myBike;

    @Before
    public void setUp() throws Exception {
        myCar = new Car();
        myBike = new Bicycle();

    }

    @Test
    public void testEngine() throws Exception {
        myCar.startEngine();
        myBike.startEngine();
    }
}