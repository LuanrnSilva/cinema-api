package com.cinema.api.model.dto.userDTO;

import com.cinema.api.model.dto.addressDTO.AddressDetails;
import jakarta.validation.constraints.NotNull;

public record UserDetailsToUpdate(
        @NotNull
        Long id,
        String email,
        String name,
        String phone,
        AddressDetails address
        ) {
}
