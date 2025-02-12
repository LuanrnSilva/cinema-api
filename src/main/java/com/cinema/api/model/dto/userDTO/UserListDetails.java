package com.cinema.api.model.dto.userDTO;

import com.cinema.api.model.Address;
import com.cinema.api.model.User;
import com.cinema.api.model.dto.addressDTO.AddressDetails;

import java.time.LocalDate;

public record UserListDetails(Long id,
                              String name,
                              String email,
                              String cpf,
                              String phone,
                              Boolean active,
                              LocalDate birthDate,
                              AddressDetails address) {

    public UserListDetails(User user) {
        this(user.getId(), user.getName(), user.getEmail(), user.getCpf(), user.getPhone(),
                user.getActive(), user.getBirthDate(), new AddressDetails(user.getAddress()));
    }
}
