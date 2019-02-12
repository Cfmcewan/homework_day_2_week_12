import ThemePark.Features.StallFun.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest{

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Ice", "Sally", "C20");
    }

    @Test
    public void canGetName(){
        assertEquals("Ice",  iceCreamStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Sally",  iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals("C20",  iceCreamStall.getParkingSpot());
    }
}
