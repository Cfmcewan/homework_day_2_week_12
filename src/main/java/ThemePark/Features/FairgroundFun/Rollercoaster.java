package ThemePark.Features.FairgroundFun;
import ThemePark.Features.IReviewed;
import ThemePark.Features.ITicketed;
import ThemePark.Visitor;


public class Rollercoaster extends ThemePark.Features.Attraction implements ISecurity, ITicketed, IReviewed {

    private Double price;
    private int rating;

    public Rollercoaster(String name, int rating) {
        super(name);
        this.price = 8.40;
        this.rating= rating;

    }

    public Boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() > 12 && visitor.getHeight() > 145) {
            return true;
        } else {
            return false;
        }
    }

    public Double defaultPrice(){
        return this.price;
    }

    public Double priceFor(Visitor visitor){
        if(visitor.getHeight() > 200) {
            return price * 2;
        } else {
            return price;
        }
    }

    public String getName(){
        return super.getName();
    }

    public int getRating() {
        return rating;
    }
}
