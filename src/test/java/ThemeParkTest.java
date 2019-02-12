import ThemePark.Features.FairgroundFun.Dodgems;
import ThemePark.Features.FairgroundFun.Park;
import ThemePark.Features.FairgroundFun.Playground;
import ThemePark.Features.FairgroundFun.Rollercoaster;
import ThemePark.Features.StallFun.CandyFlossStall;
import ThemePark.Features.StallFun.IceCreamStall;
import ThemePark.Features.StallFun.TabaccoStall;
import ThemePark.ThemePark;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Rollercoaster rollercoaster;
    Park park;
    Playground playground;
    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;
    TabaccoStall tabaccoStall;
    Visitor visitor;


    @Before
    public void before(){
        playground = new Playground("Play Place");
        park = new Park("The Green");
        rollercoaster = new Rollercoaster("The Big One");
        dodgems = new Dodgems("Dodge");
        tabaccoStall = new TabaccoStall ("Smokes", "Sol", "B20");
        iceCreamStall = new IceCreamStall("Ice", "Sally", "C20");
        visitor = new Visitor(20, 160, 30.00);
        themePark = new ThemePark(rollercoaster, park, playground, candyFlossStall, iceCreamStall, tabaccoStall, dodgems);
    }

    @Test
    public void canVisit() {
        assertEquals("I am aged 20 and I visited the attraction Dodge", themePark.visit(visitor, dodgems));
    }


}
