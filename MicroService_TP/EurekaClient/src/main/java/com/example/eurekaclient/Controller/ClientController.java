package com.example.eurekaclient.Controller;

import com.example.eurekaclient.Model.Client;
import com.example.eurekaclient.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientRepository cr;

    @GetMapping("/clients")
    public List cherhcerClient()
    {
        return cr.findAll();
    }

    @GetMapping("/clients/{id}")
    public Client chercherUnClient(@PathVariable Long id) throws
            Exception{
        return  this.cr.findById(id).orElseThrow(() -> new Exception("Client inexistant"));

    }
}
