package com.client.api.tarjeta;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "tarjetas-api")
public interface TarjetaClient {

    @GetMapping("/tarjetas/cliente/{clienteId}")
    List<Tarjeta> getTarjetasByCliente(@PathVariable Long clienteId);

    @GetMapping("/tarjetas/{id}")
    Tarjeta getTarjetaById(@PathVariable Long id);
}
