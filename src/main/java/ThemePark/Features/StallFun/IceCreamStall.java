package ThemePark.Features.StallFun;

import ThemePark.Features.IReviewed;
import ThemePark.Features.ITicketed;
import ThemePark.Visitor;

public class IceCreamStall extends ThemePark.Features.Stall implements IReviewed, ITicketed {

    private int rating;
    private Double price;

    public IceCreamStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot);
        this.rating = rating;
        this.price = 2.80;

    }

    public Double defaultPrice(){
        return price;
    }

    public Double priceFor(Visitor visitor) {
        if (visitor.getMoney() > price) {
            return visitor.getMoney() - price;
        } else return visitor.getMoney();
    }




    public int getRating() {
        return rating;
    }

    public String getName(){
        return super.getName();
    }

}

