import ThemePark.Features.FairgroundFun.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("The Big One");
    }

    @Test
    public void canGetName(){
        assertEquals("The Big One", rollercoaster.getName());
    }
}
