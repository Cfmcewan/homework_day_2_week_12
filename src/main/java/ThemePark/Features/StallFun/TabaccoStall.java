package ThemePark.Features.StallFun;

import ThemePark.Features.FairgroundFun.ISecurity;
import ThemePark.Features.IReviewed;
import ThemePark.Features.ITicketed;
import ThemePark.Visitor;

public class TabaccoStall extends ThemePark.Features.Stall implements ISecurity, IReviewed, ITicketed {

    private int rating;
    private Double price;

    public TabaccoStall(String name, String ownerName, String parkingSpot, int rating){
        super(name, ownerName, parkingSpot);
        this.rating = rating;
        this.price = 6.60;
    }

    public Boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 18) {
            return true;
        } else {
            return false;
        }
    }

    public Double defaultPrice(){
        return price;
    }

    public int getRating() {
        return rating;
    }

    public String getName(){
        return super.getName();
    }

    public Double priceFor(Visitor visitor){
        if (visitor.getMoney() > price) {
            return visitor.getMoney() - price;
        } else return visitor.getMoney();
    }
}


