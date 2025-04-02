package co.com.jonathanusers.jpa;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String firstName;
    private String lastName;
    private String userName;
    private String email;
    private int age;
}
