package ThemePark.Features.FairgroundFun;

public class Park extends ThemePark.Features.Attraction implements ThemePark.Features.IReviewed {

    private int rating;

    public Park(String name, int rating){
        super(name);
        this.rating= rating;
    }

    public int getRating() {
        return rating;
    }

    public String getName(){
        return super.getName();
    }
}
