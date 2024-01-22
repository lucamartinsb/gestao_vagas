package br.com.lucamartinsb.gestao_vagas.modules.candidate;

import java.util.UUID;

import lombok.Data;

/* Utilizar a biblioteca Lombok */
@Data /* Criar Gets e Sets para todos os atributos da classe*/
public class CandidateEntity {

    private UUID id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String description;
    private String curriculum;

    public String ToString;

}

