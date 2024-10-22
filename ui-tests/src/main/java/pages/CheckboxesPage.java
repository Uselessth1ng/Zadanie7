package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class CheckboxesPage {

    SelenideElement input1;

    SelenideElement input2;

    public CheckBoxesPageAssert check(){return CheckBoxesPageAssert.assertThat(this);};

    public CheckboxesPage(){
        input1 = $x("//input[1]");
        input2 = $x("//input[2]");
    }

    public CheckboxesPage input1Click(){
        input1.should(Condition.visible).click();
        return this;
    }

    public CheckboxesPage input2Click(){
        input2.should(Condition.visible).click();
        return this;
    }
}
