package dtos;

import lombok.*;

@Getter
public class DTOProductRequest {

    String name;
    String category;
    double price;
    int discount;

    public  DTOProductRequest(String name, String category, int price, int discount){
        this.name = name;
        this.category = category;
        this.price = price;
        this.discount = discount;
    }
}