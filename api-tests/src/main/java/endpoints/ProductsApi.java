package endpoints;

import dtos.DTOProductRequest;
import dtos.DTOProductResponse;
import io.restassured.response.Response;

public class ProductsApi extends BasicApi{

    public ProductsApi(String token){
        super(token);
    }

    public Response getProductById(String id){
        return getBuilder()
                .get(Urls.PRODUCTS + "/" + id);
    }

}
