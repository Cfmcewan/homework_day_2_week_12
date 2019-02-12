package ThemePark.Features.FairgroundFun;

import ThemePark.Features.ITicketed;
import ThemePark.Visitor;

public class Dodgems extends ThemePark.Features.Attraction implements ITicketed, ThemePark.Features.IReviewed {

    private Double price;
    private int rating;

    public Dodgems(String name, int rating) {
        super(name);
        this.price = 4.50;
        this.rating = rating;

    }

    public Double defaultPrice() {
        return this.price;
    }

    public Double priceFor(Visitor visitor){
        if(visitor.getAge() < 12) {
            return price / 2;
        } else {
            return price;
        }
    }

    public int getRating(){
        return rating;
    }

    public String getName(){
        return super.getName();
    }

}
