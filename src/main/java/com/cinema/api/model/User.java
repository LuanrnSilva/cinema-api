package com.cinema.api.model;

import com.cinema.api.model.dto.userDTO.UserDetails;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_users")
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
        this.address = new Address(userDetails.addressDetails());
    }

}
    