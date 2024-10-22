package dtos;

import lombok.*;

@Getter
@Setter
public class DTOProductResponse {
    int id;
    String name;
    String category;
    double price;
    int discount;
}