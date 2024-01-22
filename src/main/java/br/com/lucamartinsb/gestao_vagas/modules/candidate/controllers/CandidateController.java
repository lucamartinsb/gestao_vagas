package br.com.lucamartinsb.gestao_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.lucamartinsb.gestao_vagas.modules.candidate.CandidateEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    /* Vai la no corpo da requisição fazer o bind e jogar as informações na classe pelo objeto candidateEntity */
    public void create(@RequestBody CandidateEntity candidateEntity) {
        System.out.println("Candidato:");
        System.out.println(candidateEntity);
    }
}
