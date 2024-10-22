package pages;

import com.codeborne.selenide.Condition;
import org.assertj.core.api.AbstractAssert;

public class DropDownPageAssert extends AbstractAssert<DropDownPageAssert, DropDownPage> {

    public static  DropDownPageAssert assertThat(DropDownPage actual){
        return new DropDownPageAssert(actual);
    }

    public DropDownPageAssert(DropDownPage actual){
        super(actual, DropDownPageAssert.class);
    }

    public DropDownPage page(){return actual;}

    public DropDownPageAssert option1Selected(){
        actual.option1.shouldHave(Condition.attribute("selected"));
        return this;
    }

    public DropDownPageAssert option2Selected(){
        actual.option2.shouldHave(Condition.attribute("selected"));
        return this;
    }
}
