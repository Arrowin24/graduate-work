package ru.skypro.homework.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.exception.UserNotFoundException;
import ru.skypro.homework.model.User;
@Service
public interface UserService {
    public User getUser(int userId) throws UserNotFoundException;
}
