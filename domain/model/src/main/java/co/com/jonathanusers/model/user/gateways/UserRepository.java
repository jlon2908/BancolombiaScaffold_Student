package co.com.jonathanusers.model.user.gateways;

import co.com.jonathanusers.model.user.User;

import java.util.List;

public interface UserRepository {
    User getUser(String id);
    User updateUser(User user);
    void deleteUser(String id);
    User saveUser(User user);
    List<User> findAll();
}
