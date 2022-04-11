package com.mycompany.gestionstock.backend.entity;

import javax.persistence.OneToMany;
import java.util.List;

public class Family extends AbstractEntity{
    private String code;
    private String designation;

    @OneToMany(mappedBy = "family")
    private List<Article> articles;

    public Family() {
    }
}
