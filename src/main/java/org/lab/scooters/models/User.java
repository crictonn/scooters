package org.lab.scooters.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "clients")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Scooter> scooters = new ArrayList<>();

    @ManyToOne
    private Company company;

    public void addScooter(Scooter scooter){
        scooters.add(scooter);
        scooter.getUsers().add(this);
    }

    public void removeScooter(Scooter scooter){
        scooters.remove(scooter);
        scooter.getUsers().remove(this);
    }
}
