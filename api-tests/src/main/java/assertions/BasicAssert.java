package assertions;

import io.restassured.response.Response;
import org.assertj.core.api.*;

public class BasicAssert extends AbstractAssert<BasicAssert, Response> {

    public BasicAssert (Response actual){super(actual, BasicAssert.class);}

    public static BasicAssert assertThat(Response actual){return new BasicAssert(actual);}

    public BasicAssert statusCodeisEqual(int expectedCode){
        Assertions.assertThat(actual.getStatusCode())
                .as("Код ответа не равен " + expectedCode)
                .isEqualTo(expectedCode);
        return this;
    }

    public BasicAssert responseFieldIsEqual(String path, Object value){
        Assertions.assertThat(actual.jsonPath().getString(path))
                        .as("Поле '%s' не равно ожидаемому значению".formatted(path)).isEqualTo("[" + value + "]");
        return this;
    }
}
