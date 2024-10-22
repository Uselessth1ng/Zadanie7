package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class InputsPage {

    SelenideElement input = $x("//input");


    public InputsPageAssert check(){return InputsPageAssert.assertThat(this);};


    public InputsPage inputClear(){
        input.should(Condition.visible).clear();
        return this;
    }

    public InputsPage inputString(String val){
        for(int i = 0; i < val.length(); i++){
            $x("//input").sendKeys(String.valueOf(val.charAt(i)));
        }
        return this;
    }

}
