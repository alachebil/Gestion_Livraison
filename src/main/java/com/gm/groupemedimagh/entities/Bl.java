package com.gm.groupemedimagh.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bl implements Serializable {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Ref_Bl;

    private String codeClient;

    private  String articleScan;

    private LocalDate dateDepot;

    private  LocalDate dateReceptionLiv;

    private boolean etatDepot;

    private boolean etatLivrer ;


 @OneToMany(mappedBy = "bl", cascade = CascadeType.ALL)
 private List<Reclamation> reclamations;


 @OneToMany(mappedBy = "bl", cascade = CascadeType.ALL)
 private List<BLUser> blUsers;

 @OneToOne
 private Livraison livraison;

}
