package org.example.service.imp;

import org.example.domain.entities.Client;
import org.example.infrastructure.utils.CreatorDefaultObject;

import java.util.HashSet;
import java.util.Set;

public class ClientServiceImp {
    private Set<Client> clients;
     public Set<Client> generateEnumsClients(){
         return CreatorDefaultObject.createClients();
     }
}
