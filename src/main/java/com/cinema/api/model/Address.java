package com.cinema.api.model;

import com.cinema.api.model.dto.addressDTO.AddressDetails;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {

    private String street;
    private String city;
    private String zip;
    private String country;
    private String uf;
    private String complement;
    private String number;

    public Address(AddressDetails addressDetails) {
        this.street = addressDetails.street();
        this.city = addressDetails.city();
        this.zip = addressDetails.zip();
        this.country = addressDetails.country();
        this.uf = addressDetails.uf();
        this.complement = addressDetails.complement();
        this.number = addressDetails.number();
    }
}
