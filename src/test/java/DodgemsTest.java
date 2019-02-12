import ThemePark.Features.FairgroundFun.Dodgems;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void before(){
        dodgems = new Dodgems("Dodge", 6);
        visitor = new Visitor(11, 130, 30.00);
        visitor2 = new Visitor(15, 130, 30.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Dodge", dodgems.getName());
    }

    @Test
    public void canGetPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void canChargeHalfPriceTrue(){
        assertEquals(2.25, dodgems.priceFor(visitor), 0.01);
    }

    @Test
    public void canChargeHalfPriceFalse(){
        assertEquals(4.50, dodgems.priceFor(visitor2), 0.01);
    }

    @Test
    public void canGetRating(){
        assertEquals(6, dodgems.getRating());
    }
}

