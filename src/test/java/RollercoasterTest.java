import ThemePark.Features.FairgroundFun.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;


    @Before
    public void before(){
        rollercoaster = new Rollercoaster("The Big One", 8);
        visitor = new Visitor(11, 130, 30.00);
        visitor2 = new Visitor(20, 160, 30.00);
        visitor3 = new Visitor(20, 210, 30.00);


    }

    @Test
    public void canGetName(){
        assertEquals("The Big One", rollercoaster.getName());
    }

    @Test
    public void canCheckIfAllowedTrue(){
        assertEquals(true, rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canCheckIfAllowedFalse(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void canGetPrice(){
        assertEquals(8.40, rollercoaster.defaultPrice(), 0.01);
    }

    @Test
    public void chargeDoubleFeeTrue(){
        assertEquals(16.80, rollercoaster.priceFor(visitor3), 0.01);
    }

    @Test
    public void chargeDoubleFeeFalse(){
        assertEquals(8.40, rollercoaster.priceFor(visitor2), 0.01);
    }

    @Test
    public void canGetRating(){
        assertEquals(8, rollercoaster.getRating());
    }

}
