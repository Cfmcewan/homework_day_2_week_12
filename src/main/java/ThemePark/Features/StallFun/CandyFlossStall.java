package ThemePark.Features.StallFun;

import ThemePark.Features.IReviewed;
import ThemePark.Features.ITicketed;
import ThemePark.Visitor;

public class CandyFlossStall extends ThemePark.Features.Stall implements ITicketed, IReviewed {

    private Double price;
    private int rating;

    public CandyFlossStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot);
        this.price = 4.20;
        this.rating = rating;
    }

    public Double defaultPrice() {
        return price;
    }

    public Double isAllowed(Visitor visitor) {
        if (visitor.getMoney() > price) {
            return visitor.getMoney() -= price;
        } else {
            return visitor.getMoney();
        }
    }




}

