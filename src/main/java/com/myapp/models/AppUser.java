package com.myapp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.myapp.data.Role;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Users")
public class AppUser extends AbstractEntity{
    @Column(nullable = false, length = 256)
    @NotBlank(message = "Enter name!")
    private String firstName;
    @Column(nullable = false, length = 256)
    @NotBlank(message = "Enter name!")
    private String lastName;
    @Column(nullable = false, length = 60)
    private String password;
    @Column(nullable = false, length = 256, unique = true)
    @Email(message = "Enter valid email!")
    @NotNull(message = "Enter email!")
    private String email;
    @Column(length = 30)
    private String phone;
    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;
}
