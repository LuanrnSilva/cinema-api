package com.cinema.api.service;

import com.cinema.api.model.User;
import com.cinema.api.model.dto.userDTO.UserDetails;
import com.cinema.api.model.dto.userDTO.UserListDetails;
import com.cinema.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(UserDetails userDetails) {
        User user = new User(userDetails);
        return userRepository.save(user);
    }

    public Page<UserListDetails> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable).map(UserListDetails::new);
    }
}
