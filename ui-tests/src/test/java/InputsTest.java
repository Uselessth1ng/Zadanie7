import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import pages.DropDownPage;
import pages.InputsPage;

import java.util.ArrayList;
import java.util.List;

public class InputsTest extends BasicTest {

    @TestFactory
    List<DynamicTest> testInputs() {
        List<DynamicTest> dTests = new ArrayList<>();
        List<String> vals = List.of("2354", "-765", "842l5", " 12", "421 ", "asdf", " ", "123З", "?", "фыва");
        List<String> inpVals = List.of("2354", "-765", "8425", "12", "421", "", "", "123", "", "");
        internetMainPage
                .inputsButton();
        InputsPage inputsPage = new InputsPage();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            dTests.add(DynamicTest.dynamicTest(
                    "Try" + i,
                    () -> {
                        inputsPage
                                .inputClear()
                                .inputString(vals.get(finalI))
                                .check()
                                .inpVal(inpVals.get(finalI));
                    }
            ));

        }
        return dTests;
    }
}
