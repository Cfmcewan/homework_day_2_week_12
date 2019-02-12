import ThemePark.Features.StallFun.TabaccoStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TabaccoStallTest{

    TabaccoStall tabaccoStall;
    Visitor visitor;
    Visitor visitor2;



    @Before
    public void before(){
        tabaccoStall = new TabaccoStall ("Smokes", "Sol", "B20", 4);
        visitor = new Visitor(14, 160, 30.00);
        visitor2 = new Visitor(20, 160, 30.00);
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

    @Test
    public void canCheckIsAllowedToTrue(){
        assertEquals(true, tabaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void canCheckIsAllowedToFalse(){
        assertEquals(false, tabaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void canGetPrice(){
        assertEquals(6.60, tabaccoStall.defaultPrice(), 0.01);
    }

    @Test
    public void canGetRating(){
        assertEquals(4, tabaccoStall.getRating());
    }



}
