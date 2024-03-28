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
public class Conformite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_conf;

    boolean decision;
    @OneToMany(mappedBy = "conformite")
    List<CritereConformite>critereConformiteList;
    @ManyToOne
    Fichier fichier;

}
