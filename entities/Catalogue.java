package com.example.piversion1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Catalogue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_catalogue;
    String nom_catalogue;
    String descriptionC;
    Date date_creation;
    Date date_modification;
    @OneToOne
    Departement departement;
    @OneToMany (mappedBy = "catalogue")
    List<Fichier> fichierList;
}
