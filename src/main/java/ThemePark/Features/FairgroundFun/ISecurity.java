package ThemePark.Features.FairgroundFun;

import ThemePark.Visitor;

public interface ISecurity {
    Boolean isAllowedTo(Visitor visitor);
}
