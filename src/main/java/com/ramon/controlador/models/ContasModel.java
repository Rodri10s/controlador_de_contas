package com.ramon.controlador.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "contas")
@Data
public class ContasModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_contas;

    private String descricao_contas;
    private Double valor_contas;
    private Date data_vencimento;
    private Date data_pagamento;
    private String tipo_conta;
    private Boolean status_contas;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private CategoriaModel categoria;

    @ManyToOne
    @JoinColumn(name = "id_usuarios", nullable = false)
    private UsuariosModel usuarios;

    @OneToMany(mappedBy = "contas", cascade = CascadeType.ALL)
    private List<ParcelaModel> parcela;

}
