import ThemePark.Features.StallFun.TabaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TabaccoStallTest{

    TabaccoStall tabaccoStall;

    @Before
    public void before(){
        tabaccoStall = new TabaccoStall ("Smokes", "Sol", "B20");
    }

    @Test
    public void canGetName(){
        assertEquals("Smokes",  tabaccoStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Sol",  tabaccoStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals("B20",  tabaccoStall.getParkingSpot());
    }
}
