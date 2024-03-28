package com.example.piversion1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Lineage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_lineage;
    String nom_champs;
    String modifier_par;
    Date date_modification;
    @OneToOne
    Fichier fichier;

}
