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
public class MetadonneeTechnique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_metadonnee;
    int taille;
    String type_compression;
    String format;
    String parametre_encodage;
    @ManyToOne
    Fichier fichier;
}
