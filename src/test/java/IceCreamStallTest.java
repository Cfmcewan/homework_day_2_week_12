import ThemePark.Features.StallFun.IceCreamStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest{

    IceCreamStall iceCreamStall;
    Visitor visitor;
    Visitor visitor2;


    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Ice", "Sally", "C20", 6);
        visitor = new Visitor(11, 130, 1.50);
        visitor2 = new Visitor(15, 130, 30.00);
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

    @Test
    public void canGetDefaultPrice(){
        assertEquals(2.80, iceCreamStall.defaultPrice(), 0.01);
    }

    @Test
    public void canGetPriceFor(){
        assertEquals(27.20, iceCreamStall.priceFor(visitor2), 0.01);
    }


    @Test
    public void canGetRating(){
        assertEquals(6, iceCreamStall.getRating());
    }


}
