package com.mycompany.gestionstock.backend.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class Article extends AbstractEntity {
    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaireHT;
    private BigDecimal tva;
    private BigDecimal prixUnitaireTtc;
    private String photo;



    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family;



}
