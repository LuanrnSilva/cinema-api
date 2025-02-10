package com.cinema.api.model.dto.AddressDTO;

import jakarta.validation.constraints.NotBlank;

public record AddressDetails(

        @NotBlank
        String street,

        @NotBlank
        String city,

        @NotBlank
        String zip,

        @NotBlank
        String country,

        @NotBlank
        String uf,

        String complement,

        String number
) {
}
