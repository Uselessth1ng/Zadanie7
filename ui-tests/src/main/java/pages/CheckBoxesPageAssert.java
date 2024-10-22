package pages;

import com.codeborne.selenide.Condition;
import org.assertj.core.api.AbstractAssert;

public class CheckBoxesPageAssert extends AbstractAssert<CheckBoxesPageAssert, CheckboxesPage> {

    public CheckBoxesPageAssert(CheckboxesPage actual){
        super(actual, CheckBoxesPageAssert.class);
    }

    public static  CheckBoxesPageAssert assertThat(CheckboxesPage actual){
        return new CheckBoxesPageAssert(actual);
    }


    public CheckboxesPage page(){return actual;}

    public CheckBoxesPageAssert inp1Checked(){
        actual.input1.should(Condition.checked);
        return this;
    }

    public CheckBoxesPageAssert inp2NotChecked(){
        actual.input2.shouldNot(Condition.checked);
        return this;
    }

}
