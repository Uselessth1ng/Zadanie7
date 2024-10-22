package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class DropDownPage {

    SelenideElement select = $x("//select");

    SelenideElement option1 = $x("//option[@value='1']");

    SelenideElement option2 = $x("//option[@value='2']");

    public DropDownPageAssert check(){return DropDownPageAssert.assertThat(this);};


    public DropDownPage selectClick(){
        select.should(Condition.visible).click();
        return this;
    }

    public DropDownPage option1Click(){
        option1.should(Condition.visible).click();
        return this;
    }

    public DropDownPage option2Click(){
        option2.should(Condition.visible).click();
        return this;
    }
}
