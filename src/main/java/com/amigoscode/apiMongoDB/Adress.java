package com.amigoscode.apiMongoDB;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Adress {
    private String country;
    private String postCode;
    private String city;

}
