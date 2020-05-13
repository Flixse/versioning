package com.example.versioning.feature.common.address;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String postcode;
    private String street;
    private String extra;
    private short houseNumber;
    private String city;
    private String country;
    private String postBusNumber;
}
