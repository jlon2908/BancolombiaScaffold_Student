package co.com.jonathanusers.api;
import co.com.jonathanusers.model.user.User;
import co.com.jonathanusers.usecase.user.UserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final UserUseCase userUseCase;


    @GetMapping(path = "/{id}")
    public ResponseEntity<User> getUser (@PathVariable("id")String id) {
        return ResponseEntity.ok(userUseCase.getUser(id));
    }

    @PostMapping(path = "/")
    public  ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.ok(userUseCase.saveUser(user));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> delteuser(@PathVariable("id")String id){
        userUseCase.deleteUser(id);
        return ResponseEntity.ok("el usuario ha sido eliminado");
    }

    @PutMapping(path = "/")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return ResponseEntity.ok(userUseCase.updateUser(user));
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userUseCase.getAllUsers());
    }
}
