package co.com.jonathanusers.model.user;
import lombok.*;
//import lombok.NoArgsConstructor;


@Data
public class User {
    private String id;
    private  String firstName;
    private String lastName;
    private String userName;
    private String email;
    private int age;
}
