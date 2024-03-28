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
public class CritereConformite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_critere;
    String nom_critere;
    @ManyToOne
    Conformite conformite;
}
