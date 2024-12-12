package com.gm.groupemedimagh.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reclamation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private  String description;

    private  String Ref_article ;

    private Long Poid;

    private  Long Nbr ;

   private String ImageJustificatif;



//    private  String BL_ID ;

    @ManyToOne
    private Bl bl;
}
