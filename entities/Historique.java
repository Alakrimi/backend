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
public class Historique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_historique;
    Date date_modification;
    String modifier_par;
    @ManyToOne
    MetadonneeAdministrative metadonneeAdministrative;
    @ManyToOne
    MetadonneeAdministrative metadonneeAdministrativeh ;
}
