package com.example.bank.controllers;
import com.example.bank.models.Nominal;
import com.example.bank.services.NominalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nominal")
public class NominalController {
    private final NominalService nominalService;

    public NominalController(NominalService nominalService) {
        this.nominalService = nominalService;
    }

    @PostMapping("/save")
    public Nominal save (@RequestBody Nominal nominal){

        return nominalService.save(nominal);
    }
}
