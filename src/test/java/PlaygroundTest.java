import ThemePark.Features.FairgroundFun.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("Play Place");

    }

    @Test
    public void canGetName(){
        assertEquals("Play Place", playground.getName());
    }
}
