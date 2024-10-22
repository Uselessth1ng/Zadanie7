
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import pages.DisappearingElsPage;


public class DisappearingElsTest extends BasicTest{

    @DisplayName("Disappearing elements test")
    @RepeatedTest(value = 10, name = "{displayName} - repetition {currentRepetition} of {totalRepetitions}")
    void testDisapperaingEls(){
        internetMainPage
                .disappearingElsButton();
        DisappearingElsPage disappearingElsPage = new DisappearingElsPage();
        disappearingElsPage
                .check()
                .elsSize();
    }
}
