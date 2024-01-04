package com.soaprojet.gestion_departementTekup.entity;

import jakarta.persistence.Column;

public class Depart {

    @Column(name = "nom", length = 60, unique = false,nullable=false)
    private String nom;
    @Column(name = "codedepart", length = 60, unique = false,nullable=false)
    private String codedepart;
    
}