package co.com.jonathanusers.usecase.user;

import co.com.jonathanusers.model.user.User;
import co.com.jonathanusers.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserUseCase {
    private  final UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.saveUser(user);
    }

    public User updateUser(User user){
        return userRepository.updateUser(user);
    }

    public void deleteUser(String id){
         userRepository.deleteUser(id);
    }

    public User getUser(String id){
        return userRepository.getUser(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll(); // o como lo tengas mapeado desde el adapter
    }
}
