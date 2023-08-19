package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {
    List<User> getUsers();
    User showUser(Long id);
    void deleteUser(Long id);
    void saveUser(User user);
    void updateUser(User user);
}
