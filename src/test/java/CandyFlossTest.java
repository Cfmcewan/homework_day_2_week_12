import ThemePark.Features.StallFun.CandyFlossStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossTest {

    CandyFlossStall candyFlossStall;
    Visitor visitor;


    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Candy", "Bob", "G20", 6);
        visitor = new Visitor(11, 130, 30.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Candy", candyFlossStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Bob", candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals("G20", candyFlossStall.getParkingSpot());
    }

    @Test
    public void canGetPrice(){
        assertEquals(4.20, candyFlossStall.defaultPrice(), 0.01);
    }

    @Test
    public void hasIsAllowed(){
        assertEquals(4.20, candyFlossStall.isAllowed(visitor), 0.01);
    }

}
