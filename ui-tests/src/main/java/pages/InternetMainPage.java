package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$x;

public class InternetMainPage {

    SelenideElement checkboxesButton = $x("//a[@href='/checkboxes']");

    SelenideElement dropDownButton = $x("//a[@href='/dropdown']");

    SelenideElement disappearingElsButton = $x("//a[@href='/disappearing_elements']");

    SelenideElement inputsButton = $x("//a[@href='/inputs']");


    public InternetMainPage checkboxesButton(){
        checkboxesButton.should(Condition.visible).click();
        return this;
    }

    public InternetMainPage dropDownButton(){
        dropDownButton.should(Condition.visible).click();
        return this;
    }


    public InternetMainPage disappearingElsButton(){
        disappearingElsButton.should(Condition.visible).click();
        return this;
    }


    public InternetMainPage inputsButton(){
        inputsButton.should(Condition.visible).click();
        return this;
    }



}
