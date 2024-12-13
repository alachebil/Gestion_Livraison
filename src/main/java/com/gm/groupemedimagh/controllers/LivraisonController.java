package com.gm.groupemedimagh.controllers;


import com.gm.groupemedimagh.entities.Livraison;
import com.gm.groupemedimagh.services.ILivraisonService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@Slf4j
@RestController
@RequestMapping("api/Livraison")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LivraisonController {



    ILivraisonService LivraisonService;



    @GetMapping("/retrieve-all-Livraison")
    public List<Livraison> getAvis(){
        List<Livraison> listAviss = LivraisonService.getAllLivraison();
        return listAviss;
    }

}
