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
public class MetadonneeAdministrative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_metadonneeA;
    Date date_creation;
    Date date_derniere_modification;
    String droit_accees;
    String Proprietaire;
    @ManyToOne
    Fichier fichier;
    @OneToOne
    Historique historique;
    @OneToMany(mappedBy = "metadonneeAdministrative")
    List<Historique>historiqueList;
}
