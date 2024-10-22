package pages;

import com.codeborne.selenide.Condition;
import org.assertj.core.api.AbstractAssert;

import java.time.Duration;


public class InputsPageAssert extends AbstractAssert<InputsPageAssert, InputsPage> {

    public static  InputsPageAssert assertThat(InputsPage actual){
        return new InputsPageAssert(actual);
    }

    public InputsPageAssert(InputsPage actual){
        super(actual, InputsPageAssert.class);
    }

    public InputsPage page(){return actual;}

    public InputsPageAssert inpVal(String inpVal){
        actual.input.should(Condition.value(inpVal), Duration.ofSeconds(1));
        return this;
    }

}
