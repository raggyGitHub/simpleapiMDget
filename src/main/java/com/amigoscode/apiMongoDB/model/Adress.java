package com.amigoscode.apiMongoDB.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Adress {
    private String country;
    private String postCode;
    private String city;

}
