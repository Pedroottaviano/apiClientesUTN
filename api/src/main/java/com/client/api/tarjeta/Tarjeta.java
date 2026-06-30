package com.client.api.tarjeta;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Tarjeta {

    private Long id;
    private Long clienteId;
    private String numeroTarjeta;
    private String tipo;
    private String estado;
    private String marca;
    private BigDecimal limiteCredito;
    private BigDecimal saldoDisponible;
    private BigDecimal saldoUtilizado;
    private LocalDate fechaVencimiento;
    private LocalDate fechaEmision;
    private LocalDateTime fechaAlta;
    private LocalDateTime fechaModificacion;
}
