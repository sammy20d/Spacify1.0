package org.uci.spacify.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uci.spacify.entity.UserEntity;
import org.uci.spacify.repsitory.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return this.userRepository.findAll();
    }

    public Optional<UserEntity> getUser(String userId) {
        return this.userRepository.findById(userId);
    }

    public UserEntity addUser(UserEntity userEntity) {
        return this.userRepository.save(userEntity);
    }
}
