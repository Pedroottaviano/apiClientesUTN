package com.client.api.client;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Client {

    private static final int DIAS_UMBRAL = 30;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidoORazonSocial;
    private String documentoOCuit;
    private String direccion;
    private String telefono;
    private String email;
    private String tipoCliente;     // "PERSONA_FISICA" o "EMPRESA"
    private boolean activo;         // estado del cliente
    private double saldoPendiente;  // deuda acumulada en pesos
    private LocalDate fechaAlta;    // fecha de registro en el sistema


    public boolean esClienteReciente() {
        if (fechaAlta == null) return false;
        return !fechaAlta.isBefore(LocalDate.now().minusDays(DIAS_UMBRAL));
    }
}
