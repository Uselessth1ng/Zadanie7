import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.CheckboxesPage;


public class CheckboxesTest extends BasicTest{

    @ParameterizedTest
    @ValueSource(strings={"forward", "back"})
    void testCheckBoxes(String order){
        internetMainPage
                .checkboxesButton();
        CheckboxesPage checkboxesPage = new CheckboxesPage();
        if (order.equals("forward")) {
            checkboxesPage
                    .input1Click()
                    .check()
                    .inp1Checked()
                    .page()
                    .input2Click()
                    .check()
                    .inp2NotChecked();
        }
        else{
            checkboxesPage
                    .input2Click()
                    .check()
                    .inp2NotChecked()
                    .page()
                    .input1Click()
                    .check()
                    .inp1Checked();
        }
    }
}
