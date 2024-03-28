package com.example.piversion1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MetadonneeDescriptive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_metadonneeD;
    String titre;
    String auteur;
    String Description;
    String mot_cle;
    @ManyToOne
    Fichier fichier;
}
