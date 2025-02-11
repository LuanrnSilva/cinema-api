package com.cinema.api.model.dto.addressDTO;

import com.cinema.api.model.Address;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressDetails(

        @NotBlank
        String street,

        @NotBlank
        String city,

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String zip,

        @NotBlank
        String country,

        @NotBlank
        String uf,

        String complement,

        String number
) {
        public AddressDetails(Address address) {
                this(address.getStreet(), address.getCity(), address.getZip(),
                        address.getCountry(), address.getUf(), address.getComplement(),
                        address.getNumber());
        }
}
