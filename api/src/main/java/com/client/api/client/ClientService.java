package com.client.api.client;

import com.client.api.dolar.Dolar;
import com.client.api.dolar.DolarClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private DolarClient dolarClient;


    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    public Client addClient(Client addedClient) {
        return clientRepository.save(addedClient);
    }

    public Dolar getCotizacion() {
        return dolarClient.getDolar();
    }

    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }
}
