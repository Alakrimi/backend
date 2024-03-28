package com.example.piversion1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    int user_id;
    String nom_user;
    String email;
    String pwd;
    String adresse;
    Date date_creation;
    String lieudetravail;

    @ManyToMany(mappedBy = "userList")
    List<Role> roleList;
    @ManyToOne
    private  Departement departement;

}
