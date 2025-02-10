package com.cinema.api.model.dto.userDTO;

import com.cinema.api.model.dto.AddressDTO.AddressDetails;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record UserDetails(

        @NotBlank
        String name,

        @NotBlank
        String email,

        @NotBlank
        String phone,

        @NotBlank
        String cpf,

        @NotBlank
        String password,

        @NotNull
        Boolean active,

        @NotNull
        @Past
        LocalDate birthDate,

        @NotNull
        AddressDetails addressDetails
) {
}
