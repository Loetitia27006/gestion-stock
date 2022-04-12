package com.mycompany.gestionstock.backend.entity;

import java.time.Instant;
import java.util.List;

public class CommandeClient extends AbstractEntity{
    private String refCommande;
    private Instant dateCommande;
    private String Client;
    private List ligneCdeClient;
}
