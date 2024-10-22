package pages;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$x;


public class DisappearingElsPage {

    ElementsCollection el = $$x("//li");


    public DisappearingElsPageAssert check(){return DisappearingElsPageAssert.assertThat(this);};



}
