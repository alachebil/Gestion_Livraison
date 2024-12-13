package com.gm.groupemedimagh.controllers;

import com.gm.groupemedimagh.entities.Bl;
import com.gm.groupemedimagh.entities.Test;
import com.gm.groupemedimagh.services.IBLService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
//@Slf4j
@RestController
//@Tag(name = "Gestion des BL")
@RequestMapping("BL")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BLController {


    private IBLService blService;

//    @Operation(description = "récupérer toutes les bl de la base de données")
    @GetMapping("/retrieve-all-bl")
    public List<Bl> getbl() {
        return  blService.retrieveAllBl();
    }



    @PostMapping("/add")
    public Bl addTest(@RequestBody Bl bl){
        return blService.addBl(bl);
    }

}


