package ThemePark.Features.FairgroundFun;

import ThemePark.Features.FairgroundFun.ISecurity;
import ThemePark.Features.IReviewed;
import ThemePark.Visitor;


public class Playground extends ThemePark.Features.Attraction implements ISecurity, IReviewed {

    private int rating;

    public Playground(String name, int rating){
        super(name);
        this.rating = rating;
    }

    public Boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() < 15){
            return true;
        } else {
            return false;
        }
    }

    public int getRating() {
        return rating;
    }

    public String getName(){
        return super.getName();
    }
}
