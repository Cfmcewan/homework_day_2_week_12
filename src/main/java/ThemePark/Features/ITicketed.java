package ThemePark.Features;

import ThemePark.Visitor;

    public interface ITicketed {
    Double defaultPrice();
    Double priceFor(Visitor visitor);

}


