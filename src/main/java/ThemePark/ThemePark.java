package ThemePark;

import ThemePark.Features.FairgroundFun.Dodgems;
import ThemePark.Features.FairgroundFun.Park;
import ThemePark.Features.FairgroundFun.Playground;
import ThemePark.Features.FairgroundFun.Rollercoaster;
import ThemePark.Features.IReviewed;
import ThemePark.Features.StallFun.IceCreamStall;
import ThemePark.Features.StallFun.CandyFlossStall;
import ThemePark.Features.StallFun.TabaccoStall;

import java.util.ArrayList;

public class ThemePark {

    private Rollercoaster rollercoaster;
    private Park park;
    private Playground playground;
    private CandyFlossStall candyFlossStall;
    private IceCreamStall iceCreamStall;
    private TabaccoStall tabaccoStall;
    private Dodgems dodgems;
//    private ArrayList<IReviewed> allReviews;

    public ThemePark(Rollercoaster rollercoaster, Park park, Playground playground, CandyFlossStall candyFlossStall, IceCreamStall iceCreamStall, TabaccoStall tabaccoStall, Dodgems dodgems){
        this.rollercoaster = rollercoaster;
        this.park = park;
        this.playground = playground;
        this.candyFlossStall = candyFlossStall;
        this.iceCreamStall = iceCreamStall;
        this.tabaccoStall = tabaccoStall;
        this.dodgems = dodgems;
//        this.allReviews = getAllReviewed();
    }


    public String visit(Visitor visitor, Dodgems dodgems) {
        return "I am aged " + visitor.getAge() + " and I visited the attraction " + dodgems.getName();
    }

//    public ArrayList getAllReviewed(IReviewed ) {
//        ArrayList<IReviewed> result = new ArrayList<>();
//        result.add(IReviewed);
//        return result;
//
//
//
//    }
}
