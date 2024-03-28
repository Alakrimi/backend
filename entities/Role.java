package com.example.piversion1.entities;

import com.example.piversion1.entities.ennum.PermissionType;
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
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    int id_role;
    String nom_role;
    String descriptionR;
    Date date_creation;
    Date date_modification;
    @Enumerated(EnumType.STRING)
    PermissionType permission;
    @ManyToMany
    List<User>userList;

}
