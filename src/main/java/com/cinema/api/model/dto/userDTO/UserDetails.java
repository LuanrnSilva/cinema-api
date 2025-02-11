package com.cinema.api.model.dto.userDTO;

import com.cinema.api.model.dto.addressDTO.AddressDetails;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record UserDetails(

        @NotBlank
        String name,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String phone,

        @NotBlank
        @Pattern(regexp = "\\d{11,14}")
        String cpf,

        @NotBlank
        String password,

        @NotNull
        Boolean active,

        @NotNull
        @Past
        LocalDate birthDate,

        @NotNull
        @Valid
        AddressDetails addressDetails
) {
}
