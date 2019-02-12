import ThemePark.Features.StallFun.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Candy", "Bob", "G20");
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
}
