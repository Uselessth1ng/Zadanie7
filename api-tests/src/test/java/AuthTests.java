import assertions.BasicAssert;
import endpoints.AuthApi;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class AuthTests {


    @Test
    void testReg1(){
        AuthApi authApi = new AuthApi();
        Response response = authApi.registerUser("mmm1", "mmm1");
        BasicAssert.assertThat(response)
                .statusCodeisEqual(201);
    }

    @Test
    void testReg2(){
        AuthApi authApi = new AuthApi();
        Response response = authApi.registerUser("string", "string");
        BasicAssert.assertThat(response)
                .statusCodeisEqual(400);
    }

    @Test
    void testLog1(){
        AuthApi authApi = new AuthApi();
        Response response = authApi.loginUser("string", "string");
        BasicAssert.assertThat(response)
                .statusCodeisEqual(200);
    }

    @Test
    void testLog2(){
        AuthApi authApi = new AuthApi();
        Response response = authApi.loginUser("AAA", "AAA");
        BasicAssert.assertThat(response)
                .statusCodeisEqual(401);
    }
}
