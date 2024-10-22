package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.assertj.core.api.AbstractAssert;

import static com.codeborne.selenide.Condition.visible;

public class DisappearingElsPageAssert extends AbstractAssert<DisappearingElsPageAssert, DisappearingElsPage> {

    public static  DisappearingElsPageAssert assertThat(DisappearingElsPage actual){
        return new DisappearingElsPageAssert(actual);
    }

    public DisappearingElsPageAssert(DisappearingElsPage actual){
        super(actual, DisappearingElsPageAssert.class);
    }

    public DisappearingElsPage page(){return actual;}

    public DisappearingElsPageAssert elsSize(){
        actual.el.shouldHave(CollectionCondition.size(5));
        return this;
    }


}
