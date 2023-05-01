package net.proselyte.aviasales2._S.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table (name="place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "country")
    private String country;

    @Column (name = "city")
    private String city;

    @Column (name = "airport")
    private String airport;
}
