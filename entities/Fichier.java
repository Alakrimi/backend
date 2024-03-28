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
public class Fichier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_fichier;
    String fileUrl;
    @ManyToOne
    Catalogue catalogue;
    @OneToMany(mappedBy = "fichier")
    List<MetadonneeAdministrative>metadonneeAdministrativeList;
    @OneToMany(mappedBy = "fichier")
    List<MetadonneeTechnique>metadonneeTechniqueList;
    @OneToMany(mappedBy = "fichier")
    List<MetadonneeDescriptive>metadonneeDescriptiveList;
    @OneToOne
    Lineage lineage ;
    @OneToMany(mappedBy = "fichier")
    List<Champs>champs;
    @OneToMany(mappedBy = "fichier")
    List<Conformite>conformiteList;
    @OneToMany(mappedBy = "fichier")
    List<Qualite>qualiteList;


}
