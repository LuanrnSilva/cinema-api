package com.cinema.api.model;

import com.cinema.api.model.dto.userDTO.UserDetails;
import com.cinema.api.model.dto.userDTO.UserDetailsToUpdate;
import com.cinema.api.model.dto.userDTO.UserListDetails;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private Boolean active;
    private LocalDate birthDate;
    private String phone;
    private String cpf;

    @Embedded
    private Address address;

    public User(UserDetails userDetails) {
        this.active = true;
        this.name = userDetails.name();
        this.email = userDetails.email();
        this.password = userDetails.password();
        this.birthDate = userDetails.birthDate();
        this.phone = userDetails.phone();
        this.cpf = userDetails.cpf();
        this.address = new Address(userDetails.address());
    }

    public UserListDetails updateInformations(@Valid UserDetailsToUpdate userDetailsToUpdate) {
        if (userDetailsToUpdate.name() != null) {
            this.name = userDetailsToUpdate.name();
        }
        if (userDetailsToUpdate.email() != null) {
            this.email = userDetailsToUpdate.email();
        }
        if (userDetailsToUpdate.phone() != null) {
            this.phone = userDetailsToUpdate.phone();
        }
        if (userDetailsToUpdate.address() != null) {
            this.address.updateInformations(userDetailsToUpdate.address());
        }
        return null;
    }

    public void remove() {
        this.active = false;
    }
}
    