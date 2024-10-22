import org.junit.jupiter.api.Test;
import pages.DropDownPage;


public class DropDownTest extends BasicTest{
    @Test
    void testDropdown(){
        internetMainPage
                .dropDownButton();
        DropDownPage dropDownPage = new DropDownPage();
        dropDownPage
                .option1Click()
                .check()
                .option1Selected()
                .page()
                .option2Click()
                .check()
                .option2Selected();
    }
}
