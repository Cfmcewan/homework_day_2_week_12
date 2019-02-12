import ThemePark.Features.FairgroundFun.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;
    Visitor visitor2;


    @Before
    public void before(){
        playground = new Playground("Play Place", 8);
        visitor = new Visitor(14, 160, 30.00);
        visitor2 = new Visitor(20, 160, 30.00);

    }

    @Test
    public void canGetName(){
        assertEquals("Play Place", playground.getName());

    }

    @Test
    public void canCheckIsAllowedToTrue(){
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void canCheckIsAllowedToFalse(){
        assertEquals(false, playground.isAllowedTo(visitor2));
    }

    @Test
    public void canGetRating(){
        assertEquals(8, playground.getRating());
    }

}

