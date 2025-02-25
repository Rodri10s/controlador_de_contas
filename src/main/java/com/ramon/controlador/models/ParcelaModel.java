package com.ramon.controlador.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "parcela")
@Data
public class ParcelaModel {

    private Long id_parcela;
    private Date data_vencimento;
    private int numero_parcelas;
    private Double valor_parcela;
    private String status_parcela;

    @ManyToOne
    @JoinColumn(name = "id_contas", nullable = false)
    private ContasModel contas;

}
