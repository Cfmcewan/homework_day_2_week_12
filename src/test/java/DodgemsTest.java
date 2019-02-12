import ThemePark.Features.FairgroundFun.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Dodge");
    }

    @Test
    public void canGetName(){
        assertEquals("Dodge", dodgems.getName());
    }
}
