package com.gm.groupemedimagh.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BLUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Bl bl;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Utilisateur user;

}
