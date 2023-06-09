package net.proselyte.aviasales2._S.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "email")
    private String email;
    @Column (name = "password")
    private String password;
    @Column (name = "balance")
    private Double balance;


}
