package com.client.api.client;

import com.client.api.dolar.Dolar;
import com.client.api.tarjeta.Tarjeta;
import com.client.api.tarjeta.TarjetaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/clientes")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private TarjetaClient tarjetaClient;

    @PostMapping("/agregar")
    public Client addClient(@RequestBody Client addedClient){
        return clientService.addClient(addedClient);
    }

    @GetMapping
    public List<Client> getClients(){
        return clientService.getClients();
    }

    @GetMapping("/{id}")
    public Optional<Client> getClientById(@PathVariable Long id){
        return clientService.getClientById(id);
    }

    @GetMapping("/cotizacion/mep")
    public Dolar getCotizacion(){
        return clientService.getCotizacion();
    }

    @DeleteMapping("/eliminar/{id}")
    public void deleteClientById(@PathVariable Long id){
        clientService.deleteById(id);
    }

    @GetMapping("/{id}/tarjetas")
    public List<Tarjeta> getTarjetasByCliente(@PathVariable Long id){
        return tarjetaClient.getTarjetasByCliente(id);
    }
}
