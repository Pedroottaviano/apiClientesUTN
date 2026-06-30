package com.client.api.account;

import com.client.api.client.Client;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    private String numeroCuenta;

    @Enumerated(EnumType.STRING)
    private Currency moneda;
    private BigDecimal saldo;

    private Boolean activo;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;

}
