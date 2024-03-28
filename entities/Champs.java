package com.example.piversion1.entities;

import com.example.piversion1.entities.ennum.LibelleType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Champs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_champs;
    String nom_champs;
    String type_champs;
    @Enumerated(EnumType.STRING)
    LibelleType libelle;
    @ManyToOne
    Fichier fichier;

}
