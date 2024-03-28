package com.example.piversion1.entities;

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
public class CritereQualite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_Critere_qualite;
    String nom_critere;
    float pourcentage;
    @ManyToOne
    Qualite qualite;
}
