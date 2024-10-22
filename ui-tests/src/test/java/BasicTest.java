import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.InternetMainPage;
import utils.UIProps;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BasicTest {

    UIProps props = ConfigFactory.create(UIProps.class);

    protected InternetMainPage internetMainPage = new InternetMainPage();

    @BeforeEach
    void openInternet(){
        Configuration.baseUrl = "";
        String url = props.baseUrl();

        Configuration.browser = CHROME;
        Selenide.open(url);
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    @AfterEach
    void tearDown(){closeWebDriver();}
}
