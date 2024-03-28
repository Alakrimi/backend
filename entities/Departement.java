package com.example.piversion1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.LazyToOne;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_dep;
    String nom_dep;

    @OneToMany(mappedBy = "departement")
    List<User> userList;

    @OneToOne
    Catalogue catalogue;
}
