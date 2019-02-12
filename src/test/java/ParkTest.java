import ThemePark.Features.FairgroundFun.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("The Green", 10);
    }

    @Test
    public void canGetName(){
        assertEquals("The Green", park.getName());
    }


    @Test
    public void canGetRating(){
        assertEquals(10, park.getRating());
    }


}
