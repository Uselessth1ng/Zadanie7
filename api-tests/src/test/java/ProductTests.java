import assertions.BasicAssert;
import endpoints.AuthApi;
import endpoints.ProductsApi;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTests {

    ProductsApi productsApi;

    @BeforeEach
    void getToken(){
        String token = AuthApi.loginUser("string", "string")
                .jsonPath().getString("access_token");
        productsApi = new ProductsApi(token);

    }

    @Test
    void testProduct1(){
        Response response = productsApi.getProductById("1");

        BasicAssert.assertThat(response)
                .statusCodeisEqual(200)
                .responseFieldIsEqual("category", "Electronics")
                .responseFieldIsEqual("discount", 10.0)
                .responseFieldIsEqual("id", "1")
                .responseFieldIsEqual("name", "HP Pavilion Laptop")
                .responseFieldIsEqual("price", "10.99");
    }

    @Test
    void testProduct2(){
        Response response = productsApi.getProductById("1123131");
        BasicAssert.assertThat(response)
                .statusCodeisEqual(404);
    }
}
