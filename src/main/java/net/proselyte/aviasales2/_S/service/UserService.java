package net.proselyte.aviasales2._S.service;

import net.proselyte.aviasales2._S.model.User;
import net.proselyte.aviasales2._S.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class UserService {
    Logger log;
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> findAll() {
         return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    public boolean login(User user) {
        return userRepository.existsByEmail(user.getEmail());
    }

    public void checkPassword(User user) {
        String[] fullPassword = user.getPassword().split(",");
        if (!(fullPassword[0].equals(fullPassword[1]))) {
            System.out.println("Пароль неверен");
        } else {
            System.out.println("Успешно");
            user.setPassword(fullPassword[0]);
        }
    }
    public boolean isUserInSystem(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            System.out.println("Пользователь уже существует");
        } else {
            System.out.println("Пользователь создан");
        }

        return userRepository.existsByEmail((user.getEmail()));
    }
}
