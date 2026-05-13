package com.client.api;

import com.client.api.client.Client;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void esClienteRecienteTest() {
        Client cliente = new Client();
        cliente.setFechaAlta(LocalDate.now().minusDays(10));
        assertTrue(cliente.esClienteReciente());
    }

    @Test
    void noEsClienteRecienteTest() {
        Client cliente = new Client();
        cliente.setFechaAlta(LocalDate.now().minusDays(31));
        assertFalse(cliente.esClienteReciente());
    }
}
